package com.aize.b_collections.service.impl;

import com.aize.b_collections.persistence.dao.ItemCollectionRepository;
import com.aize.b_collections.persistence.model.ItemCollection;
import com.aize.b_collections.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service("itemCollectionService")
public class ItemCollectionService extends CrudServiceImpl<ItemCollection, String> {
    public ItemCollectionService(ItemCollectionRepository itemCollectionRepository) {
        super(itemCollectionRepository);
    }
}
