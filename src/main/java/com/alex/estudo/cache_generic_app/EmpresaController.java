package com.alex.estudo.cache_generic_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @GetMapping
    public ResponseEntity<List<EmpresaEntity>> findAll() {
        var result = service.findAll();
        System.out.println(result);
        return ResponseEntity.ok(result);
    }
}
