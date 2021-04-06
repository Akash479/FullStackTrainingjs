package com.example.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public class RepositotyImplcls implements RepositoryImpl {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public String add() {
		System.out.println("Safasfs");
		employee e= new employee();
		e.setName("samrat");
		e.setSalary( 800000);
		 jdbcTemplate.update("INSERT INTO Employee (name, Salary) VALUES ('"+e.getName()+"', '"+e.getSalary()+"')");
		 return "SucessFully Saved";
	}

}
