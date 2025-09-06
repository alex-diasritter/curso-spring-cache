package com.alex.estudo.cache_generic_app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmpresaEntity {

    @Id
    private long id;
    private String nome;

    public EmpresaEntity() {
    }

    public EmpresaEntity(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
