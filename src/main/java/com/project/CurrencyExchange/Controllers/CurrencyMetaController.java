/**
 * CurrencyMetaController - Auto-generated class
 *
 * @Author: @RahulBudhiraja
 * @Created: 6/21/2025
 */

package com.project.CurrencyExchange.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyMetaController {

    @GetMapping("/api/currencies")
    public List<String> getSupportedCurrencies() {
        return Arrays.asList("USD", "EUR", "INR", "JPY", "SGD", "GBP", "AUD", "CAD"); //
    }
}
