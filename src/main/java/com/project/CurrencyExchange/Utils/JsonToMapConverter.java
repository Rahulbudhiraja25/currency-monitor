package com.project.CurrencyExchange.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.math.BigDecimal;
import java.util.Map;

@Converter(autoApply = false)
public class JsonToMapConverter implements AttributeConverter<Map<String, BigDecimal>, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, BigDecimal> attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (Exception e) {
            throw new RuntimeException("Could not serialize JSON", e);
        }
    }

    @Override
    public Map<String, BigDecimal> convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData,
                    objectMapper.getTypeFactory().constructMapType(Map.class, String.class, BigDecimal.class));
        } catch (Exception e) {
            throw new RuntimeException("Could not deserialize JSON", e);
        }
    }
}

