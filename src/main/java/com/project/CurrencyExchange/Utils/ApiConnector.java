package com.project.CurrencyExchange.Utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.CurrencyExchange.Utils.HttpConnector;
import com.project.CurrencyExchange.Utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ApiConnector {

    @Autowired
    private HttpConnector httpConnector;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Calls Frankfurter API and parses USD to INR exchange rate
     * @return BigDecimal rate
     * @Author: @RahulBudhiraja
     */
    public BigDecimal fetchUsdToAnyRate(String currencyCode) {
        String url = Constants.FRANKFURTER_API_URL + "?from=USD&to"+currencyCode;

        try {
            ResponseEntity<String> response = httpConnector.get(url, null, String.class);

            JsonNode root = objectMapper.readTree(response.getBody());
            JsonNode inrNode = root.path("rates").path(currencyCode);

            if (inrNode.isMissingNode()) {
                throw new IllegalStateException(currencyCode+" rate not found in response.");
            }

            return inrNode.decimalValue();

        } catch (Exception e) {
            throw new RuntimeException("Error parsing exchange rate from API", e);
        }
    }
}
