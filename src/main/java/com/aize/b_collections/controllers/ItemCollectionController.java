package com.aize.b_collections.controllers;

import com.aize.b_collections.persistence.model.ItemCollection;
import com.aize.b_collections.service.impl.ItemCollectionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/collection")
public class ItemCollectionController extends CrudController<ItemCollection, String> {
    protected ItemCollectionController(ItemCollectionService service) {
        super(service);
    }


}
