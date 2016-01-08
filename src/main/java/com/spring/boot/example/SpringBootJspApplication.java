package com.spring.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJspApplication.class, args);
	}

}
