/**
 * UrlShortRepository - Auto-generated interface
 *
 * @Author: @RahulBudhiraja
 * @Created: 6/22/2025
 */

package com.project.CurrencyExchange.repository;


import com.project.CurrencyExchange.DTO.UrlShortnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UrlShortRepository extends JpaRepository<UrlShortnerEntity,String> {

    Optional<UrlShortnerEntity> findByurlKey(String urlKey);
}
