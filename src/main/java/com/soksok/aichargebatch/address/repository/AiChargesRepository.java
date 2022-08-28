package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.entity.AiCharges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AiChargesRepository extends JpaRepository<AiCharges, String> {
    @Query("SELECT a FROM AiCharges a WHERE a.createdDate < :endDate ")
    List<AiCharges> findByCreatedDate(LocalDate endDate);
}

