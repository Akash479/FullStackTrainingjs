package com.example.demo.db;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/subjectsApi")
@CrossOrigin("*")
public class SubectsAPI {
	@Autowired
	UserRepoInterface userRepo;
	
	String FindByName;
	@Autowired
	SubjectsInterrepo SubjectsInterrepo;
	
	@PostMapping("/adduser")
	ResponseObject  addUser(@RequestBody UserModel um) {
		System.out.println(um);
		userRepo.save(um);
		return new ResponseObject("Registered SucessFully");
	}
	

		
	@PostMapping("/loignuser")
	ResponseObject  loginUser(@RequestBody loginModel lm) {
		
	 UserModel um=	userRepo.getByUserNameAndPassWord(lm.getUserName(),lm.getPassword());
	 System.out.println(um);
	 if(um == null) {
		return  new ResponseObject("Please Check the User name and password");
	 }else {
		 return  new ResponseObject("Loigin SucessFull");
	 }
		
	}
	
	@GetMapping("/getAllData/{userName}")
	public  UserModel getAllData(@PathVariable String userName) {
		FindByName=userName;
		UserModel um= userRepo.findByUserName(userName);
		return um;
		
	}
	@PostMapping("/addSubjects")
	public ResponseObject  saveSubjects(@RequestBody Reqsubects rs ) {
		System.out.println( "load"+rs.getId());
		if(rs.getId() == 0) {
			UserModel um = userRepo.findByUserName(FindByName);
			Subjectmodel sm= new Subjectmodel();
			sm.setSubjName(rs.getSubjName());
			sm.setDate(rs.getDate());
			sm.setMarks(rs.getMarks());
			sm.setUs(um);
			ArrayList<Subjectmodel> al= new ArrayList<>();
			al.add(sm);
			um.setSm(al);
			userRepo.save(um);
			return  new ResponseObject("Saved SucessFully");
		}	
		else {
			System.out.println("edit"+rs.getId());
			Subjectmodel dmsm = SubjectsInterrepo.findById(rs.getId()).orElse(null);
			dmsm.setSubjName(rs.getSubjName());
			dmsm.setDate(rs.getDate());
			dmsm.setMarks(rs.getMarks());
			SubjectsInterrepo.save(dmsm);
			return  new ResponseObject("Updated SucessFully");
		}
		
		
	}
	
	@GetMapping("/deleteSub/{id}")
	ResponseObject deleteSub(@PathVariable int id) {
		SubjectsInterrepo.deleteById(id);
		
		return  new ResponseObject("Deleted SucessFully");
	}

}
