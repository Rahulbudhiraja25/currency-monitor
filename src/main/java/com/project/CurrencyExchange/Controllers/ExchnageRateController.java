package com.project.CurrencyExchange.Controllers;

import com.project.CurrencyExchange.Utils.ApiConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
public class ExchnageRateController {

    @Autowired
    public ApiConnector apiConnector;
    @GetMapping("/{currency}")
    public String getExchangeonUsd(@RequestParam String currency){
        String resp;
        resp=apiConnector.fetchUsdToAnyRate(currency).toString();
        return resp;
    }


}

