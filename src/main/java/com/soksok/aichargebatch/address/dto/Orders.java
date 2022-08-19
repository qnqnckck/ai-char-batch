package com.soksok.aichargebatch.address.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "ORDERS")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    String orderId;
    String orderNo;
    String receiveCompanyId;
    String customerId;
    int status;
    String startAreaName;
    String startArea;
    double startAreaLat;
    double startAreaLong;
    String passAreaName;
    String passAreaLat;
    String passAreaLong;
    String destinationAreaName;
    String destinationArea;
    double destinationAreaLat;
    double destinationAreaLong;
    int selectedRecommendChargeNo;
    int standardCharge;
    int passCharge;
    int extraCharge;
    int watingCharge;
    String driverGender;
    String processCompany;
    String driverId;
    LocalDateTime receiveDate;
    LocalDateTime assignmentTime;
    LocalDateTime arrivalTime;
    LocalDateTime driverStartTime;
    LocalDateTime completionTime;
    int insuranceType;
    String insuranceCompany;
    String insuranceNumber;
    LocalDateTime insuranceStart;
    LocalDateTime insuranceEnd;
    String customerName;
    String customerPhoneNumber;
    float paybackRate;
}
