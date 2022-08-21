package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {

    List<Orders> findAll();

//    Optional<List<Orders>> findByOrderId(String orderId);

//    List<Orders> findByReceiveDate(LocalDateTime receiveDateTime);
}
