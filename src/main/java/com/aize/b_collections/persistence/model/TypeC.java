package com.aize.b_collections.persistence.model;

import com.aize.b_collections.utils.HashMapConverter;
import com.aize.b_collections.utils.ObjectSizeFetcher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.Map;

@Setter
@Getter
@Entity
public class TypeC extends TypeA {
    private final long MAX_SIZE_MB = 20;
    private String attributesJSON;

    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> attributes;

    public TypeC() {
    }

    public void serializeCustomerAttributes() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        // ToDo - isObjectWithSizeLimit agent
        this.attributesJSON = objectMapper.writeValueAsString(attributes);
    }

    public void deserializeCustomerAttributes() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.attributes = objectMapper.readValue(attributesJSON,
                new TypeReference<Map<String, Object>>() {
                });
    }

    public boolean isObjectWithSizeLimit(Map<String, Object> attributes) {

        ObjectSizeFetcher.getObjectSize(new TypeC());
        // ToDo - Investigate better solution for this
        // It would be better to catch the size
        // breech when a new entry is added to the map,
        // not at the time of persisting.
        long objectSize = 0;
        long mb = 0;
        if (attributes != null) {
            objectSize = ObjectSizeFetcher.getObjectSize(attributes);
            mb = objectSize / 1024;
        }
        return mb <= MAX_SIZE_MB;
    }
}
