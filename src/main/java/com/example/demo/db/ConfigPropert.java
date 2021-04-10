package com.example.demo.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.di.van;

@Configuration
public class ConfigPropert {
	
	
	@Bean
	@Scope("prototype")
	public teacher te() {
		return new teacher();
		
	}
	
	@Bean
	public van va() {
		return new van();
	}

}
