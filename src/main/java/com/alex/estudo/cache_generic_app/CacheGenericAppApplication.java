package com.alex.estudo.cache_generic_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheGenericAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheGenericAppApplication.class, args);
	}

}
