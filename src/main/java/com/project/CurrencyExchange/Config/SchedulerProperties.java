package com.project.CurrencyExchange.Config;

import org.springframework.stereotype.Component;

@Component
public class SchedulerProperties {

    private final boolean enabled = true;
    private final String cron ="0 0 * * * *"; // after every 1 hour
    private final String baseCurrency = "USD";

    public boolean isEnabled() {
        return enabled;
    }

    public String getCron() {
        return cron;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }
}

