package com.example.demo.di;

import org.springframework.stereotype.Component;

@Component
public class van {

	
	public hasa ha;
	public van(){
	System.out.println("Van Constructor");
	}

	public hasa getHa() {
		return ha;
	}

	public void setHa(hasa ha) {
		this.ha = ha;
	}
	
	public void  me() {
		System.out.println("ASfsfA");
	}
	
}
