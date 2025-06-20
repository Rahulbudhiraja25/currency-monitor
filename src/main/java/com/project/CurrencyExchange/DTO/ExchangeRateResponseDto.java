package com.project.CurrencyExchange.DTO;

import java.math.BigDecimal;
import java.util.Map;

public class ExchangeRateResponseDto {
    private Map<String, BigDecimal> rates;

    // Getter & Setter
    public Map<String, BigDecimal> getRates() {
        return rates;
    }

    public void setRates(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }
}
