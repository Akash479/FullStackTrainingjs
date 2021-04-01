package com.example.demo.db;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class resoirces {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/save")
	@Transactional
	public String save() {
		System.out.println("Safasfs");
		employee e= new employee();
		e.setName("ashok");
		e.setSalary( 800000);
		 jdbcTemplate.update("INSERT INTO Employee (name, Salary) VALUES ('"+e.getName()+"', '"+e.getSalary()+"')");
		 return "SucessFully Saved";
		
		
	}

}
