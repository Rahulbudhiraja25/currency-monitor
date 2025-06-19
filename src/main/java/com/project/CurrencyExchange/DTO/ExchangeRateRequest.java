package com.project.CurrencyExchange.DTO;


/**
 * Dto Of Exchange Rate Request
 * @Author: @RahulBudhiraja
 */

public class ExchangeRateRequest {
    private String baseCurrency;
    private String targetCurrencies;

    public ExchangeRateRequest() {}

    public ExchangeRateRequest(String baseCurrency, String targetCurrencies) {
        this.baseCurrency = baseCurrency;
        this.targetCurrencies = targetCurrencies;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getTargetCurrencies() {
        return targetCurrencies;
    }

    public void setTargetCurrencies(String targetCurrencies) {
        this.targetCurrencies = targetCurrencies;
    }
}
