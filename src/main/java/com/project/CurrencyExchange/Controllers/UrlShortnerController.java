/**
 * UrlShortnerController - Auto-generated class
 *
 * @Author: @RahulBudhiraja
 * @Created: 6/22/2025
 */

package com.project.CurrencyExchange.Controllers;

import com.project.CurrencyExchange.Services.UrlShortnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlShortnerController {

    @Autowired
    UrlShortnerService urlShortnerService;
    @GetMapping("/buildbase")
    public String ShortUrlGenrator(@RequestParam String baseUrl){
        String output = urlShortnerService.urlShortPost(baseUrl);
        return output;
    }

    @GetMapping("/sh")
    public ResponseEntity<Void> GetShortUrl(@RequestParam String urlKey){
        String orignalUrl=urlShortnerService.urlShortGet(urlKey);

        return ResponseEntity
                .status(302)
                .header("Location",orignalUrl)
                .build();
    }

}
