package com.project.CurrencyExchange.repository;

import com.project.CurrencyExchange.DTO.ExchangeRateLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRateLogRepository extends JpaRepository<ExchangeRateLogEntity, Long> {
}
