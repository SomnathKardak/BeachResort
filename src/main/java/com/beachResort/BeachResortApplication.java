package com.beachResort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.beachResort.*")
public class BeachResortApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeachResortApplication.class, args);
	}

}
