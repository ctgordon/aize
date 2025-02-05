package com.aize.b_collections.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Setter
@Entity
public class ItemCollection {
    @Getter
    @Setter
    @Id
    private Long id;
    @Getter
    private String name;
    @Getter
    private String description;
    @Getter
    private Date creationDate;
    @Getter
    private Date lastModified;
    @OneToMany
    private List<TypeA> typeAList;
    @OneToMany
    private List<TypeB> typeBList;
    @OneToMany
    private List<TypeC> typeCList;
    @OneToMany
    static Map<String, ItemCollection> childItemCollections = new HashMap<>();

    public ItemCollection() {
    }

    public void setDeleted(boolean deleted) {
    }

    public void setChildItemCollections(Map<String, ItemCollection> childItemCollections) {
        ItemCollection.childItemCollections = childItemCollections;
    }

}
