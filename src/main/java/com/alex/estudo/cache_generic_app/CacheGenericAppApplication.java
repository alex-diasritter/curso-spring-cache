package com.alex.estudo.cache_generic_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class CacheGenericAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheGenericAppApplication.class, args);
	}

}
