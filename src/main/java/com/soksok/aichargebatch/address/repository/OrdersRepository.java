package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.dto.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {

    List<Orders> findAll();

//    Optional<List<Orders>> findByOrderId(String orderId);

//    List<Orders> findByReceiveDate(LocalDateTime receiveDateTime);
}
