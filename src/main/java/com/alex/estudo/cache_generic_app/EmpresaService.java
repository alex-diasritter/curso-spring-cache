package com.alex.estudo.cache_generic_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    @Cacheable("empresas") //ConcurrentHashMap
    public List<EmpresaEntity> findAll() {
        return (List<EmpresaEntity>) repository.findAll();
    }
}
