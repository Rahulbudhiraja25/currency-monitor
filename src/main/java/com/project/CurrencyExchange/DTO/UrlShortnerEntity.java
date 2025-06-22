/**
 * UrlShortnerEntity - Auto-generated class
 *
 * @Author: @RahulBudhiraja
 * @Created: 6/22/2025
 */

package com.project.CurrencyExchange.DTO;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "RB_CX_TINY_URL")
public class UrlShortnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getTinyUrl() {
        return tinyUrl;
    }

    public void setTinyUrl(String tinyUrl) {
        this.tinyUrl = tinyUrl;
    }

    @NotBlank(message = "Base url cannot be Null")
    private String baseUrl;

    @NotBlank(message = "Tiny Url cannot be null")
    private String tinyUrl;

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    @NotBlank(message = "Key Cannot be null")
    private String urlKey;
}
