package com.alex.estudo.cache_generic_app;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class CacheAgendado {

    @Scheduled(fixedDelay = 30, timeUnit = TimeUnit.SECONDS)
    @CacheEvict("empresas")
    public void limparCacheEmpresa(){
        System.out.println("Executando limpeza de cache: " + LocalDateTime.now());
    }
}
