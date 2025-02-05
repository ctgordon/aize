package com.aize.b_collections.service;

import com.aize.b_collections.persistence.dao.TypeARepository;
import com.aize.b_collections.persistence.dao.TypeBRepository;
import com.aize.b_collections.persistence.model.TypeA;
import com.aize.b_collections.persistence.model.TypeB;
import com.aize.b_collections.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TypeBService extends CrudServiceImpl<TypeB, String> {
    public TypeBService(TypeBRepository typeBRepository) {
        super(typeBRepository);
    }
}
