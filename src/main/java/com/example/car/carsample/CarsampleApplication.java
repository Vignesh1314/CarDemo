package com.example.car.carsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }) 
public class CarsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsampleApplication.class, args);
	}

}
