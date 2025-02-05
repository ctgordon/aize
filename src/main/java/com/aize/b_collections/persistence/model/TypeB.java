package com.aize.b_collections.persistence.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TypeB extends TypeA {
    private Long id;
    private String externalWebsiteLink;

    public TypeB() {}
}
