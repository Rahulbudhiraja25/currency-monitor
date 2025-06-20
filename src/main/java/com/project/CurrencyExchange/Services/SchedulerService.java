package com.project.CurrencyExchange.Services;

import com.project.CurrencyExchange.Utils.ApiConnector;
import com.project.CurrencyExchange.Config.SchedulerProperties;
import com.project.CurrencyExchange.DTO.ExchangeRateLogEntity;
import com.project.CurrencyExchange.repository.ExchangeRateLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Service
public class SchedulerService {

    @Autowired
    private SchedulerProperties schedulerProperties;

    @Autowired
    private ApiConnector apiConnector;

    @Autowired
    private ExchangeRateLogRepository repository;

    @Scheduled(cron = "#{@schedulerProperties.cron}")
    public void fetchAndSaveRates() {
        if (!schedulerProperties.isEnabled()) return;

        try {
            String base = schedulerProperties.getBaseCurrency();
            Map<String, BigDecimal> rates = apiConnector.fetchRatesForBase(base);

            ExchangeRateLogEntity entity = new ExchangeRateLogEntity();
            entity.setBaseCurrency(base);
            entity.setRates(rates);
            entity.setTimestamp(LocalDateTime.now());

            repository.save(entity);
            System.out.println("✅ Rates logged at " + entity.getTimestamp());
        } catch (Exception e) {
            System.err.println("❌ Scheduler failed: " + e.getMessage());
        }
    }
}
