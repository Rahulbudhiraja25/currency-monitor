/**
 * DashboardController - Auto-generated class
 *
 * @Author: @RahulBudhiraja
 * @Created: 6/21/2025
 */

package com.project.CurrencyExchange.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String showDashboard(Model model) {
        return "Dashboard";
    }
}
