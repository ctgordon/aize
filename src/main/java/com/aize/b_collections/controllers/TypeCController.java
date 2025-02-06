package com.aize.b_collections.controllers;

import com.aize.b_collections.persistence.model.TypeB;
import com.aize.b_collections.persistence.model.TypeC;
import com.aize.b_collections.service.CrudService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/typec")
public class TypeCController extends CrudController<TypeC, String> {
    protected TypeCController(CrudService<TypeC, String> service) {
        super(service);
    }
}
