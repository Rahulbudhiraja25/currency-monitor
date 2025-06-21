package com.project.CurrencyExchange.DTO;

import com.project.CurrencyExchange.Utils.JsonToMapConverter;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "exchange_rate_logs")
public class ExchangeRateLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }
    @Transient
    private String jsonView;
    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
    public String getJsonView() {
        return jsonView;
    }
    public void setJsonView(String jsonView) {
        this.jsonView = jsonView;
    }

    @Column(columnDefinition = "CLOB")
    public Map<String, BigDecimal> getRates() {
        return rates;
    }

    public void setRates(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    private String baseCurrency;

    @Convert(converter = JsonToMapConverter.class)
    private Map<String, BigDecimal> rates;

    private LocalDateTime timestamp;

}
