package com.aize.b_collections.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashMapConverter implements AttributeConverter<Map<String, Object>, String> {

    @Override
    public String convertToDatabaseColumn(Map<String, Object> customerInfo) {

        ObjectMapper objectMapper = new ObjectMapper();

        String dbValue = null;
        try {
            dbValue = objectMapper.writeValueAsString(customerInfo);
        } catch (final JsonProcessingException e) {
            System.out.println("JSON writing error: " + e);
        }

        return dbValue;
    }

    @Override
    public Map<String, Object> convertToEntityAttribute(String customerInfoJSON) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> objectMap = null;
        try {
            objectMap = objectMapper.readValue(customerInfoJSON,
                    new TypeReference<HashMap<String, Object>>() {
                    });
        } catch (final IOException e) {
            System.out.println("JSON reading error: " + e);
        }

        return objectMap;
    }
}
