package com.soksok.aichargebatch.address.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ORDERS")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
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

}
