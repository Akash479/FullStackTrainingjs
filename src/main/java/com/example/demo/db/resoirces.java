package com.example.demo.db;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.di.van;

@RestController
@RequestMapping("/controller")

// localhost:9000/controller/save

public class resoirces {
	
	
	@Autowired
	ServiceImpl serI;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	van va;
	
	@GetMapping(value="/save",produces = MediaType.APPLICATION_JSON_VALUE)
	//@GetMapping("/save")
	@Transactional
	public String save() {
		
		return serI.add();
	}
	@GetMapping("/update")
	@Transactional
	public String upadte() {
		
		
		 return serI.updateDataInDb();
		
	}
//
//	@GetMapping("/delete")
//	@Transactional
//	public String delate() {
//		System.out.println("Safasfs");
//		employee e= new employee();
//		e.setName("varma");
//		System.out.println(e.getName());
//		 jdbcTemplate.update("delete from  Employee  where id=2 ");
//		 return "SucessFully Deleted";
//		
//	}
//	@GetMapping("/all")
//	@Transactional
//	public List<employee> getAllData() {
//		System.out.println("Safasfs");
//		employee e= new employee();
//		e.setName("varma");
//		System.out.println(e.getName());
//		 ArrayList<employee> al= (ArrayList<employee>) jdbcTemplate.query("select  * from Employee ", new BeanPropertyRowMapper(employee.class));
//		 System.out.println(al);
//		 return al;
//		
//	}
	@PostMapping("/addData")
	public Messge D2(@RequestBody() loginFields lg) {
	System.out.println(lg);
	
		return new Messge("D2 Method Called");
	}
	@GetMapping("/addData/{idx}")
	public Messge D21(@PathVariable int idx) {
		System.out.println(idx);
	String s= String.valueOf(idx);
	
		return new Messge(s);
	}
	
	//http://localhost:9000/controller/reqParam?name1=value1&name2=value2
	@GetMapping(value="/reqParam",produces = MediaType.APPLICATION_XML_VALUE)
	public Messge D211(@RequestParam("username") String uname,@RequestParam("password") String pword) {
		String s= "UserName:  "+uname+"Password:  "+pword;
	
	return new Messge(s);
		//return "afsafjas";
	}
	@GetMapping("/abc")
	 public String msge() {
		 va.me();
		 
		 return "Bean Concept";
	 }
	
	
}
