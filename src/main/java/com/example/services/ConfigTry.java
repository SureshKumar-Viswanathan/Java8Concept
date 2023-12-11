package com.example.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Pojo.Person;

@Configuration
public class ConfigTry {

    @Bean
    Person don() {
		return new Person("sureshKumar", 27, Long.valueOf(7767978820L), 2, true);
	}
    
    @Bean
    Person donw() {
		return new Person("ssgv", 28, Long.valueOf(77679788120L), 3, true);
	}


}
