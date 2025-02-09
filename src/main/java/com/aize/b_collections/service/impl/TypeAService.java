package com.aize.b_collections.service.impl;

import com.aize.b_collections.persistence.dao.TypeARepository;
import com.aize.b_collections.persistence.model.TypeA;
import com.aize.b_collections.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TypeAService extends CrudServiceImpl<TypeA, Long> {
    public TypeAService(TypeARepository typeARepository) {
        super(typeARepository);
    }
}
