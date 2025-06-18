package com.project.CurrencyExchange.Utils;

public final class Constants {
    private Constants() {}
    // === API URLs ===
    public static final String FRANKFURTER_API_URL = "https://api.frankfurter.app/latest";

    // === Currency Defaults ===
    public static final String DEFAULT_BASE_CURRENCY = "USD";
    public static final String DEFAULT_TARGET_CURRENCIES = "INR,EUR";

    // === Scheduler Constants ===
    public static final String CRON_HOURLY = "0 0 * * * *"; // every hour
    public static final String CRON_DAILY = "0 0 9 * * *"; // every day at 9 AM

    // === Logging or Messages ===
    public static final String API_CALL_SUCCESS = "Exchange rate data fetched successfully.";
    public static final String API_CALL_FAILED = "Failed to fetch exchange rate data.";

    // === Application Meta ===
    public static final String APPLICATION_NAME = "CurrencyExchange";
}
