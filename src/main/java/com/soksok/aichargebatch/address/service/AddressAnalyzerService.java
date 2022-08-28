package com.soksok.aichargebatch.address.service;

import com.soksok.aichargebatch.address.entity.*;
import com.soksok.aichargebatch.address.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

@Service
@RequiredArgsConstructor
public class AddressAnalyzerService {

    public final Map<String, String> areaList = new HashMap<>();

    private final AreasRepository areasRepository;
    private final OrdersRepository ordersRepository;
    private final AiOrdersRepository aiOrdersRepository;

    private final AiChargesRepository aiChargesRepository;

    private final AiChargesHistoryRepository aiChargesHistoryRepository;

    private static final String DELIMITER_SPACE = " ";

    @Transactional
    public void parser(boolean isAll, String specificDay) {
        setAreaList();
        List<Orders> orders = null;

        if (isAll) {
            LocalDateTime endTime;
            endTime = LocalDateTime.now().truncatedTo(ChronoUnit.DAYS);
            orders = ordersRepository.findByAssignmentTime(endTime);
        } else {

            LocalDateTime startTime;
            LocalDateTime endTime;
            // 설정이되어 있지 않다면 이전날 기준
            if (specificDay.equals("0")) {

                startTime = LocalDateTime.now().minusDays(1).truncatedTo(ChronoUnit.DAYS);
                ;
                endTime = LocalDateTime.now().truncatedTo(ChronoUnit.DAYS);
            } else {
                String pattern = "YYYYMMDD";
                startTime = LocalDateTime.parse(specificDay, DateTimeFormatter.ofPattern(pattern));
                endTime = startTime.plusDays(1);
            }
            orders = ordersRepository.findByAssignmentTime(startTime, endTime);
        }

        List<String> startAreaIds = new ArrayList<>();
        List<String> passAreaIds = new ArrayList<>();
        List<String> destinationAreaIds = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            String target = orders.get(i).getStartAreaOldAddress();
            if (target != null) {
                startAreaIds = getAreaIds(target);
            }

            target = orders.get(i).getDestinationAreaOldAddress();
            if (target != null) {
                destinationAreaIds = getAreaIds(target);
            }

            for (int l = 0; l < startAreaIds.size(); l++) {
                for (int k = 0; k < destinationAreaIds.size(); k++) {
                    AiOrders aiOrders = AiOrders.create(
                            orders.get(i),
                            startAreaIds.get(l),
                            destinationAreaIds.get(k),
                            getAssignmentWatingTime(orders.get(i).getRequestAssignmentTime(), orders.get(i).getAssignmentTime()),
                            Integer.parseInt(orders.get(i).getRequestAssignmentTime().format(DateTimeFormatter.ofPattern("HH")))
                    );
                    aiOrdersRepository.save(aiOrders);
                }
            }
            startAreaIds.clear();
            passAreaIds.clear();
            destinationAreaIds.clear();
        }
    }

    private int getAssignmentWatingTime(LocalDateTime requestAssignmentTime, LocalDateTime assignmentTime) {
        Duration duration = Duration.between(requestAssignmentTime, assignmentTime);
        return (int) (duration.getSeconds() / 60) + 1;
    }

    private void setAreaList() {
        List<Areas> areas = areasRepository.findAll();
        String key = null;
        for (int i = 0; i < areas.size(); i++) {
            key = areas.get(i).getName1() + areas.get(i).getName2() + areas.get(i).getName3() + areas.get(i).getName4() + areas.get(i).getName5();
            areaList.put(key, areas.get(i).getAreaId());
        }
        ;

    }

    public String replaceName1(String name1) {

        if (name1.contains("경기")) {
            return "경기도";
        } else if (name1.contains("서울")) {
            return "서울특별시";
        } else if (name1.contains("전북")) {
            return "전라북도";
        } else if (name1.contains("경남")) {
            return "경상남도";
        } else if (name1.contains("경북")) {
            return "경상북도";
        } else if (name1.contains("충북")) {
            return "충청북도";
        } else if (name1.contains("충남")) {
            return "충청남도";
        } else if (name1.contains("부산")) {
            return "부산광역시";
        } else if (name1.contains("전남")) {
            return "전라남도";
        } else if (name1.contains("대구")) {
            return "대구광역시";
        } else if (name1.contains("인천")) {
            return "인천광역시";
        } else if (name1.contains("울산")) {
            return "울산광역시";
        } else if (name1.contains("제주")) {
            return "제주특별자치도";
        } else if (name1.contains("서울")) {
            return "서울특별시";
        } else if (name1.contains("광주")) {
            return "광주광역시";
        } else if (name1.contains("대구")) {
            return "대전광역시";
        } else if (name1.contains("세종")) {
            return "세종특별자치시";
        }
        return name1;
    }

    public List<String> getAreaIds(String area) {
        List<String> ret = new ArrayList<>();
        String[] split = area.split(AddressAnalyzerService.DELIMITER_SPACE);
        split[0] = replaceName1(split[0]);
        Optional<Areas> areas = Optional.ofNullable(null);
        String areaId = null;
        if (split.length >= 2) {
            for (int j = 1; j < split.length; j++) {
                areaId = null;
                switch (j) {
                    case 1:
                        areaId = getAreaId(split[0], split[1], null, null, null);
                        break;
                    case 2:
                        areaId = getAreaId(split[0], split[1], split[2], null, null);
                        break;
                    case 3:
                        areaId = getAreaId(split[0], split[1], split[2], split[3], null);
                        break;
                    case 4:
                        areaId = getAreaId(split[0], split[1], split[2], split[3], split[4]);
                        break;
                }

                if (areaId != null) {
                    ret.add(areaId);
                }
            }
        }
        return ret;
    }

    public String getAreaId(String name1, String name2, String name3, String name4, String name5) {
        String key = name1 + name2 + name3 + name4 + name5;
        return areaList.get(key);
    }

    public void tidyUp() {
        //AiOrders
        LocalDate createdDate;
        createdDate = LocalDate.now().minusDays(1);

        List<AiCharges> aiChargesList = aiChargesRepository.findByCreatedDate(createdDate);
        for(int i=0; i<aiChargesList.size(); i++){
            AiCharges aiCharges = aiChargesList.get(i);

            AiChargesHistory aiChargesHistory = AiChargesHistory.create(aiCharges);
            aiChargesHistoryRepository.save(aiChargesHistory);
        }

        aiChargesRepository.deleteAll(aiChargesList);
    }
}
