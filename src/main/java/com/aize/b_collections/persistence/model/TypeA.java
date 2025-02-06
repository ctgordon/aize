package com.aize.b_collections.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
public class TypeA {
    @Getter
    @Setter
    @Id
    private Long id;
    private String name;
    private Date creationDate;
    private Long collectionId;

    public TypeA() {}

}
