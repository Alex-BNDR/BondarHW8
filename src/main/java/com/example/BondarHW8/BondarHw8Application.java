package com.example.BondarHW8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.BondarHW8"})
public class BondarHw8Application {

	public static void main(String[] args) {
		SpringApplication.run(BondarHw8Application.class, args);
	}

}
