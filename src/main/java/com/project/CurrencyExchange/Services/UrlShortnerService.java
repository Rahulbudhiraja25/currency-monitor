/**
 * UrlShortnerService - Auto-generated class
 *
 * @Author: @RahulBudhiraja
 * @Created: 6/22/2025
 */

package com.project.CurrencyExchange.Services;


import com.project.CurrencyExchange.DTO.UrlShortnerEntity;
import com.project.CurrencyExchange.Utils.Constants;
import com.project.CurrencyExchange.repository.UrlShortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Optional;
import java.util.random.RandomGenerator;

@Service
public class UrlShortnerService {


    @Autowired
    UrlShortRepository urlShortRepository;
//    @Autowired

    public String urlShortPost(String baseUrl){
        String shortUrl;
        SecureRandom random = new SecureRandom();
        int number = Math.abs(random.nextInt());
        shortUrl= Constants.LOCALHOST+"/sh?urlKey="+number;
        UrlShortnerEntity urlShortnerEntity =new UrlShortnerEntity();
            urlShortnerEntity.setBaseUrl(baseUrl);
            urlShortnerEntity.setTinyUrl(shortUrl);
        urlShortnerEntity.setUrlKey(String.valueOf(number));
        try{
            urlShortRepository.save(urlShortnerEntity);
            return "Records save successfully"+"\n"+"URL ="+shortUrl;
        }
        catch (Exception e){
            return "Error in saving records";
        }
    }


    public String urlShortGet(String urlKey){
        Optional<UrlShortnerEntity> output;
        try {
            output=urlShortRepository.findByurlKey(urlKey);
            return output.get().getBaseUrl();
        }
        catch (Exception e){
            return "No url Found";
        }
    }

}
