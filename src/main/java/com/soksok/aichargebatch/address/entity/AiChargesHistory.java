package com.soksok.aichargebatch.address.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Entity
@Table(name = "AI_CHARGES_HISTORY")
@NoArgsConstructor
@AllArgsConstructor
public class AiChargesHistory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    BigInteger id;
    @Column(name = "CREATED_DATE")
    LocalDate createdDate;
    @Column(name = "ORDER_WEEKDAY")
    Integer orderWeekday;
    @Column(name = "START_TIME")
    LocalDateTime startTime;
    @Column(name = "END_TIME")
    LocalDateTime endTime;
    @Column(name = "COMPANY_ID")
    String companyId;
    @Column(name = "START_AREA_ID")
    String startAreaId;
    @Column(name = "DESTINATION_AREA_ID")
    String destinationAreaId;
    @Column(name = "AI_CHARGE")
    Integer aiCharge;
    @Column(name = "AI_10_CHARGE")
    Integer ai10Charge;
    @Column(name = "AI_20_CHARGE")
    Integer ai20Charge;
    @Column(name = "AI_30_CHARGE")
    Integer ai30Charge;

    public static AiChargesHistory create(AiCharges aiCharges){
        return AiChargesHistory.builder()
                .createdDate(aiCharges.createdDate)
                .orderWeekday(aiCharges.orderWeekday)
                .startTime(aiCharges.startTime)
                .endTime(aiCharges.endTime)
                .companyId(aiCharges.companyId)
                .startAreaId(aiCharges.startAreaId)
                .destinationAreaId(aiCharges.destinationAreaId)
                .aiCharge(aiCharges.aiCharge)
                .ai10Charge(aiCharges.ai10Charge)
                .ai20Charge(aiCharges.ai20Charge)
                .ai30Charge(aiCharges.ai30Charge)
                .build();
    }

}
