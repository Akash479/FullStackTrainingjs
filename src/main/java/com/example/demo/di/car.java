package com.example.demo.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class car implements Vechile{
	
	

	@Override
	public void m2() {
		System.out.println(" Car m2");
		
	}

}
