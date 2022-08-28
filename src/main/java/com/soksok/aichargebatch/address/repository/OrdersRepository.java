package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {
    @Query("SELECT a FROM Orders a WHERE a.assignmentTime < :endDate AND a.assignmentTime is not null")
    List<Orders> findByAssignmentTime(LocalDateTime endDate);

    @Query("SELECT a FROM Orders a WHERE a.requestAssignmentTime between :startDate AND :endDate")
    List<Orders> findByAssignmentTime(LocalDateTime startDate, LocalDateTime endDate);
}
