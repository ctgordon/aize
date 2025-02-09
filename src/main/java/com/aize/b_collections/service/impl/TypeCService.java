package com.aize.b_collections.service.impl;

import com.aize.b_collections.persistence.dao.TypeCRepository;
import com.aize.b_collections.persistence.model.TypeC;
import com.aize.b_collections.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TypeCService extends CrudServiceImpl<TypeC, Long> {
    public TypeCService(TypeCRepository typeCRepository) {
        super(typeCRepository);
    }
}
