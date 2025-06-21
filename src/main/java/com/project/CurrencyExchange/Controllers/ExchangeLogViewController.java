/**
 * ExchangeLogViewController - Auto-generated class
 *
 * @Author: @RahulBudhiraja
 * @Created: 6/21/2025
 */

package com.project.CurrencyExchange.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.CurrencyExchange.DTO.ExchangeRateLogEntity;
import com.project.CurrencyExchange.repository.ExchangeRateLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExchangeLogViewController {

    @Autowired
    private ExchangeRateLogRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/logs")
    public String showLogs(Model model) {
        List<ExchangeRateLogEntity> logs = repository.findAll();

        // Convert each rates map to JSON string
        logs.forEach(log -> {
            try {
                String jsonString = objectMapper.writeValueAsString(log.getRates());
                log.setJsonView(jsonString);
            } catch (Exception e) {
                log.setJsonView("Error parsing JSON");
            }
        });

        model.addAttribute("logs", logs);
        return "exchange-log";
    }
}
