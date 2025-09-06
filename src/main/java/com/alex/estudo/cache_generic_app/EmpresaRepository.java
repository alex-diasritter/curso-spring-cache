package com.alex.estudo.cache_generic_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

    @NativeQuery("select * from empresa;")
    List<EmpresaEntity> findAll();
}
