package com.project.CurrencyExchange.Utils;

import java.util.Map;

/**
 * Class to store list of all currency code and names
 * @return Map<String, BigDecimal>  response
 * @Author: @RahulBudhiraja
 */

public class CurrencyNameMapper {
    public static final Map<String, String> CURRENCY_NAMES = Map.ofEntries(
            Map.entry("AUD", "Australian Dollar"),
            Map.entry("BGN", "Bulgarian Lev"),
            Map.entry("BRL", "Brazilian Real"),
            Map.entry("CAD", "Canadian Dollar"),
            Map.entry("CHF", "Swiss Franc"),
            Map.entry("CNY", "Chinese Yuan"),
            Map.entry("CZK", "Czech Koruna"),
            Map.entry("DKK", "Danish Krone"),
            Map.entry("EUR", "Euro"),
            Map.entry("GBP", "British Pound"),
            Map.entry("HKD", "Hong Kong Dollar"),
            Map.entry("HUF", "Hungarian Forint"),
            Map.entry("IDR", "Indonesian Rupiah"),
            Map.entry("ILS", "Israeli New Shekel"),
            Map.entry("INR", "Indian Rupee"),
            Map.entry("ISK", "Icelandic Króna"),
            Map.entry("JPY", "Japanese Yen"),
            Map.entry("KRW", "South Korean Won"),
            Map.entry("MXN", "Mexican Peso"),
            Map.entry("MYR", "Malaysian Ringgit"),
            Map.entry("NOK", "Norwegian Krone"),
            Map.entry("NZD", "New Zealand Dollar"),
            Map.entry("PHP", "Philippine Peso"),
            Map.entry("PLN", "Polish Zloty"),
            Map.entry("RON", "Romanian Leu"),
            Map.entry("SEK", "Swedish Krona"),
            Map.entry("SGD", "Singapore Dollar"),
            Map.entry("THB", "Thai Baht"),
            Map.entry("TRY", "Turkish Lira"),
            Map.entry("ZAR", "South African Rand")
    );
}
