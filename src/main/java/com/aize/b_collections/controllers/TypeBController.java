package com.aize.b_collections.controllers;

import com.aize.b_collections.persistence.model.TypeA;
import com.aize.b_collections.persistence.model.TypeB;
import com.aize.b_collections.service.CrudService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/typeb")
public class TypeBController extends CrudController<TypeB, Long> {
    protected TypeBController(CrudService<TypeB, Long> service) {
        super(service);
    }
}
