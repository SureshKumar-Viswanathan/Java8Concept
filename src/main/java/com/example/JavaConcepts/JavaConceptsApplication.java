package com.example.JavaConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.Pojo","com.example.services","com.example.Persistence"})
public class JavaConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConceptsApplication.class, args);
	}

}
