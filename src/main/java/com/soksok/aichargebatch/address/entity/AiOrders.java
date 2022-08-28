package com.soksok.aichargebatch.address.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Entity
@Table(name = "AI_ORDERS")
@NoArgsConstructor
@AllArgsConstructor
public class AiOrders {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    Long id;
    @Column(name = "ORDER_ID")
    String orderId;
    @Column(name = "START_AREA_NAME")
    String startAreaName;
    @Column(name = "START_AREA_ID")
    String startAreaId;
    @Column(name = "START_AREA_OLD_ADDRESS")
    String startAreaOldAddress;
    @Column(name = "START_AREA_ROAD_ADDRESS")
    String startAreaRoadAddress;
    @Column(name = "START_AREA_LAT")
    double startAreaLat;
    @Column(name = "START_AREA_LONG")
    double startAreaLong;
    @Column(name = "DESTINATION_AREA_NAME")
    String destinationAreaName;
    @Column(name = "DESTINATION_AREA_ID")
    String destinationAreaId;
    @Column(name = "DESTINATION_AREA_OLD_ADDRESS")
    String destinationAreaOldAddress;
    @Column(name = "DESTINATION_AREA_ROAD_ADDRESS")
    String destinationAreaRoadAddress;
    @Column(name = "DESTINATION_AREA_LAT")
    double destinationAreaLat;
    @Column(name = "DESTINATION_AREA_LONG")
    double destinationAreaLong;
    @Column(name = "STANDARD_CHARGE")
    int standardCharge;
    @Column(name = "PASS_CHARGE")
    int passCharge;
    @Column(name = "EXTRA_CHARGE")
    int extraCharge;
    @Column(name = "WAITING_CHARGE")
    int waitingCharge;
    @Column(name = "RECEIVE_DATE")
    LocalDateTime receiveDate;
    @Column(name = "ASSIGNMENT_TIME")
    LocalDateTime assignmentTime;
    @Column(name = "ARRIVAL_TIME")
    LocalDateTime arrivalTime;
    @Column(name = "DRIVING_START_TIME")
    LocalDateTime drivingStartTime;
    @Column(name = "COMPLETION_TIME")
    LocalDateTime completionTime;
    @Column(name = "REQUEST_ASSIGNMENT_TIME")
    LocalDateTime requestAssignmentTime;
    @Column(name = "ASSIGNMENT_WAITING_TIME")
    Integer assignmentWaitingTime;
    @Column(name = "REQUEST_ASSIGNMENT_TIME_HOUR")
    Integer requestAssignmentTimeHour;

    public static AiOrders create(Orders orders, String startAreaId,  String destinationAreaId, Integer assignmentWaitingTime, Integer requestAssignmentTimeHour){
        return AiOrders.builder()
                .orderId(orders.orderId)
                .startAreaName(orders.startAreaName)
                .startAreaId(startAreaId)
                .startAreaOldAddress(orders.startAreaOldAddress)
                .startAreaRoadAddress(orders.startAreaRoadAddress)
                .startAreaLat(orders.startAreaLat)
                .startAreaLong(orders.startAreaLong)
                .destinationAreaName(orders.destinationAreaName)
                .destinationAreaId(destinationAreaId)
                .destinationAreaOldAddress(orders.destinationAreaOldAddress)
                .destinationAreaRoadAddress(orders.destinationAreaRoadAddress)
                .destinationAreaLat(orders.destinationAreaLat)
                .destinationAreaLong(orders.destinationAreaLong)
                .standardCharge(orders.standardCharge)
                .passCharge(orders.passCharge)
                .extraCharge(orders.extraCharge)
                .waitingCharge(orders.waitingCharge)
                .receiveDate(orders.receiveDate)
                .assignmentTime(orders.assignmentTime)
                .arrivalTime(orders.arrivalTime)
                .drivingStartTime(orders.drivingStartTime)
                .completionTime(orders.completionTime)
                .requestAssignmentTime(orders.requestAssignmentTime)
                .assignmentWaitingTime(assignmentWaitingTime)
                .requestAssignmentTimeHour(requestAssignmentTimeHour)
                .build();
    }

}
