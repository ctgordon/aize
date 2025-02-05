package com.aize.b_collections.persistence.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TypeC extends TypeA {
    private String id;
    @JsonProperty("json")
    private String json;

    public TypeC() {
    }

}
