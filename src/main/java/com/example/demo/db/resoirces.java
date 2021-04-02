package com.example.demo.db;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")

// localhost:9000/controller/save
public class resoirces {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/save")
	@Transactional
	public String save() {
		System.out.println("Safasfs");
		employee e= new employee();
		e.setName("samrat");
		e.setSalary( 800000);
		 jdbcTemplate.update("INSERT INTO Employee (name, Salary) VALUES ('"+e.getName()+"', '"+e.getSalary()+"')");
		 return "SucessFully Saved";
		
	}
	@GetMapping("/update")
	@Transactional
	public String upadte() {
		System.out.println("Safasfs");
		employee e= new employee();
		e.setName("varma");
		System.out.println(e.getName());
		 jdbcTemplate.update("update Employee set name='"+e.getName()+"' where id=2 ");
		 return "SucessFully Updated";
		
	}

	@GetMapping("/delete")
	@Transactional
	public String delate() {
		System.out.println("Safasfs");
		employee e= new employee();
		e.setName("varma");
		System.out.println(e.getName());
		 jdbcTemplate.update("delete from  Employee  where id=2 ");
		 return "SucessFully Deleted";
		
	}
	@GetMapping("/all")
	@Transactional
	public List<employee> getAllData() {
		System.out.println("Safasfs");
		employee e= new employee();
		e.setName("varma");
		System.out.println(e.getName());
		 ArrayList<employee> al= (ArrayList<employee>) jdbcTemplate.query("select  * from Employee ", new BeanPropertyRowMapper(employee.class));
		 System.out.println(al);
		 return al;
		
	}
	
}
