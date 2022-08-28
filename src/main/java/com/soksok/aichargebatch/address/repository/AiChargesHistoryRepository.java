package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.entity.AiChargesHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiChargesHistoryRepository extends JpaRepository<AiChargesHistory, String> {
}

