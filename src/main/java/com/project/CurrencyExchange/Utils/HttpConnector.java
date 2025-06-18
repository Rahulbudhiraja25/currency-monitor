package com.project.CurrencyExchange.Utils;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class HttpConnector {

    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * Generic GET Request
     * Takes headers and URL
     * Returns response
     * @Author: @RahulBudhiraja
     */
    public <T> ResponseEntity<T> get(String url, Map<String, String> headers, Class<T> responseType) {
        HttpHeaders httpHeaders = new HttpHeaders();
        if (headers != null) {
            headers.forEach(httpHeaders::add);
        }

        HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange(url, HttpMethod.GET, entity, responseType);
    }

    /**
     * Generic POST Request
     * Takes headers, URL, and request body
     * Returns response
     * @Author: @RahulBudhiraja
     */
    public <T, R> ResponseEntity<R> post(String url, Map<String, String> headers, T requestBody, Class<R> responseType) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        if (headers != null) {
            headers.forEach(httpHeaders::add);
        }

        HttpEntity<T> entity = new HttpEntity<>(requestBody, httpHeaders);
        return restTemplate.exchange(url, HttpMethod.POST, entity, responseType);
    }
}
