package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.example.demo"})
@SpringBootApplication
public class HibernateSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringApplication.class, args);
	}

}
