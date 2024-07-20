package com.uberclone.core.foodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.uberclone.core.foodservice.dao")
public class FoodServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FoodServiceApplication.class, args);
	}
}
