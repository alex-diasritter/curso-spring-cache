package com.alex.estudo.cache_generic_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CacheService {

    @Autowired
    private CacheManager manager;

    //este metodo serve para limpar o cache de chaves específicas.
    public void evictAllCacheValues(String cacheName) {
        Objects.requireNonNull(manager.getCache(cacheName)).clear();
    }
}
