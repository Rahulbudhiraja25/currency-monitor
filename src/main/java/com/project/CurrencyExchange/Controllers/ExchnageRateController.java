package com.project.CurrencyExchange.Controllers;

import com.project.CurrencyExchange.Utils.ApiConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/exchange")
public class ExchnageRateController {

    @Autowired
    public ApiConnector apiConnector;


    /**
     * Controller to call APi to get USD to Currency Exchange Rate
     * @return String resp
     * @Author: @RahulBudhiraja
     */
    @GetMapping("/{currency}")
    public String getExchangeonUsd(@RequestParam String currency){
        String resp;
        resp=apiConnector.fetchUsdToAnyRate(currency).toString();
        return resp;
    }

    /**
     * Controller to call APi to get Base to All Currency Exchange Rate
     * @return Map<String, BigDecimal>  response
     * @Author: @RahulBudhiraja
     */

    @GetMapping("/base/all")
    public Map<String, BigDecimal> getExchangeOnBase(@RequestParam String currency){
        Map<String, BigDecimal> response;
        response =apiConnector.fetchRatesForBase(currency);
        return response;
    }

}

