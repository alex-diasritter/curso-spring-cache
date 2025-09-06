package com.alex.estudo.cache_generic_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public List<EmpresaEntity> findAll() {
        System.out.println("Service acionado");
        System.out.println(repository.findAll());
        return (List<EmpresaEntity>) repository.findAll();
    }
}
