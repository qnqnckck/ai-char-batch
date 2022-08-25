package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.entity.Orders;
import org.joda.time.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {
    @Query("SELECT a FROM Orders a WHERE a.assignmentTime < :endDate")
    List<Orders> findByAssignmentTime(DateTime endDate);

    @Query("SELECT a FROM Orders a WHERE a.assignmentTime between :startDate AND :endDate")
    List<Orders> findByAssignmentTime(DateTime startDate, DateTime endDate);
}
