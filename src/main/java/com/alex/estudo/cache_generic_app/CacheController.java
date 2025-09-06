package com.alex.estudo.cache_generic_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clear")
public class CacheController {

    @Autowired
    private CacheService service;

    @PostMapping
    public void clear (@RequestParam("cacheName") String cacheName) {
        service.evictAllCacheValues(cacheName);
    }

}
