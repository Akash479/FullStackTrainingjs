package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/d1")
public class employee {
	// Field Injection
//	@Autowired
//	Subjects s;
	
	// Constructor Injection
//	Subjects s;
//	@Autowired
//	employee(Subjects s){
//		this.s=s;
//	}
	
	// Setter Injection 
	Subjects s;
	@Autowired
	void Setemployee(Subjects s){
		this.s=s;
	}
	
	@Autowired
	@Qualifier("bike")
	Vechile v;
	
	@GetMapping("/m1")
	public void m2() {
		s.setSubId(1);
		//s.setSubName("Physics");
		s.printC();
		v.m2();
	}

}
