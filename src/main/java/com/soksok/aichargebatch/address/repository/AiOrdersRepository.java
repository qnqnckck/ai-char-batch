package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.dto.AiOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AiOrdersRepository extends JpaRepository<AiOrders, String> {
    List<AiOrders> findAll();
}
