package com.soksok.aichargebatch.address.dto;

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
    @Column(name = "ORDER_NO")
    String orderNo;
    @Column(name = "RECEIVE_COMPANY_ID")
    String receiveCompanyId;
    @Column(name = "CUSTOMER_ID")
    String customerId;
    @Column(name = "CUSTOMER_NAME")
    String customerName;
    @Column(name = "CUSTOMER_PHONE_NUMBER")
    String customerPhoneNumber;
    @Column(name = "STATUS")
    int status;
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
    @Column(name = "SELECTED_RECOMMEND_CHARGE_NO")
    Integer selectedRecommendChargeNo;
    @Column(name = "CHARGE_TYPE")
    String chargeType;
    @Column(name = "STANDARD_CHARGE")
    int standardCharge;
    @Column(name = "PASS_CHARGE")
    int passCharge;
    @Column(name = "EXTRA_CHARGE")
    int extraCharge;
    @Column(name = "WAITING_CHARGE")
    int waitingCharge;
    @Column(name = "POINT")
    int point;
    @Column(name = "CREDIT_CARD_ID")
    String creditCardId;
    @Column(name = "DRIVER_GENDER")
    String driverGender;
    @Column(name = "PROCESS_COMPANY_ID")
    String processCompanyId;
    @Column(name = "DRIVER_ID")
    String driverId;
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
    @Column(name = "INSURANCE_TYPE")
    Integer insuranceType;
    @Column(name = "INSURANCE_COMPANY")
    String insuranceCompany;
    @Column(name = "INSURANCE_NUMBER")
    String insuranceNumber;
    @Column(name = "INSURANCE_START_DATE")
    LocalDateTime insuranceStartDate;
    @Column(name = "INSURANCE_END_DATE")
    LocalDateTime insuranceEndDate;
    @Column(name = "PAYBACK_RATE")
    float paybackRate;
    @Column(name = "NOT_DISPLAY_ON_CUSTOMER")
    int notDisplayOnCustomer;
    @Column(name = "STANDARD_CHARGE_TYPE")
    int standardChargeType;
    @Column(name = "PARENT_ORDER_ID")
    String parentOrderId;
    @Column(name = "TRANSFER_ID")
    String transferId;
    @Column(name = "INSURANCE_PREMIUM")
    int insurancePremium;
    @Column(name = "CUSTOMER_SAFE_PHONE_NUMBER")
    String customerSafePhoneNumber;
    @Column(name = "DRIVER_SAFE_PHONE_NUMBER")
    String driverSafePhoneNumber;
    @Column(name = "DRIVER_NAME")
    String driverName;
    @Column(name = "DRIVER_PHONE_NUMBER")
    String driverPhoneNumber;
    @Column(name = "MEMO")
    String memo;
    @Column(name = "REQUEST_ASSIGNMENT_TIME")
    LocalDateTime requestAssignmentTime;
    @Column(name = "DRIVER_PROFILE_URL")
    String driverProfileUrl;
    @Column(name = "CUSTOMER_CONFIRMED")
    int customerConfirmed;

    public static AiOrders create(Orders orders, String startAreaId,  String destinationAreaId){
        return AiOrders.builder()
                .orderId(orders.orderId)
                .orderNo(orders.orderNo)
                .receiveCompanyId(orders.receiveCompanyId)
                .customerId(orders.customerId)
                .customerName(orders.customerName)
                .customerPhoneNumber(orders.customerPhoneNumber)
                .status(orders.status)
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
                .selectedRecommendChargeNo(orders.selectedRecommendChargeNo)
                .chargeType(orders.chargeType)
                .standardCharge(orders.standardCharge)
                .passCharge(orders.passCharge)
                .extraCharge(orders.extraCharge)
                .waitingCharge(orders.waitingCharge)
                .point(orders.point)
                .creditCardId(orders.creditCardId)
                .driverGender(orders.driverGender)
                .processCompanyId(orders.processCompanyId)
                .driverId(orders.driverId)
                .receiveDate(orders.receiveDate)
                .assignmentTime(orders.assignmentTime)
                .arrivalTime(orders.arrivalTime)
                .drivingStartTime(orders.drivingStartTime)
                .completionTime(orders.completionTime)
                .insuranceType(orders.insuranceType)
                .insuranceCompany(orders.insuranceCompany)
                .insuranceNumber(orders.insuranceNumber)
                .insuranceStartDate(orders.insuranceStartDate)
                .insuranceEndDate(orders.insuranceEndDate)
                .paybackRate(orders.paybackRate)
                .notDisplayOnCustomer(orders.notDisplayOnCustomer)
                .standardChargeType(orders.standardChargeType)
                .parentOrderId(orders.parentOrderId)
                .transferId(orders.transferId)
                .insurancePremium(orders.insurancePremium)
                .customerSafePhoneNumber(orders.customerSafePhoneNumber)
                .driverSafePhoneNumber(orders.driverSafePhoneNumber)
                .driverName(orders.driverName)
                .driverPhoneNumber(orders.driverPhoneNumber)
                .memo(orders.memo)
                .requestAssignmentTime(orders.requestAssignmentTime)
                .driverProfileUrl(orders.driverProfileUrl)
                .customerConfirmed(orders.customerConfirmed)
                .build();
    }

}
