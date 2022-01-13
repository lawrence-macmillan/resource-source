package com.example.ukpowergrid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Annotation to set up our Spring Boot application automatically
public class UkPowerGridApplication {

	public static void main(String[] args) {
		SpringApplication.run(UkPowerGridApplication.class, args); // The JVM will seek the main method as the starting point of the application
	}

}
