package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.db.ConfigPropert;
import com.example.demo.db.teacher;
import com.example.demo.resource.corefeatu.AppConfig;
import com.example.demo.resource.corefeatu.message;

@SpringBootApplication
public class FullSTackTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullSTackTrainingSpringApplication.class, args);
		 AnnotationConfigApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(ConfigPropert.class);
		 teacher me= ctx.getBean(teacher.class);
		 
		me.setName("ashok");
		 System.out.println(me.getName());
		 
		 teacher me1= ctx.getBean(teacher.class);
		 
		 System.out.println(me1.getName());
	}

}
