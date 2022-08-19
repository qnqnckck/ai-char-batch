package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.dto.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, LocalDateTime> {
    List<Orders> findByReceiveDate(LocalDateTime receiveDateTime);
}
