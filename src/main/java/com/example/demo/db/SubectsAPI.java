package com.example.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjectsApi")
@CrossOrigin("*")
public class SubectsAPI {
	@Autowired
	UserRepoInterface userRepo;
	
	@PostMapping("/adduser")
	ResponseObject  addUser(@RequestBody UserModel um) {
		System.out.println(um);
		userRepo.save(um);
		return new ResponseObject("Registered SucessFully");
	}
	
	@GetMapping("/loignuser")
	ResponseObject  loginUser() {
		
//	@PostMapping("/loignuser")
//	ResponseObject  loginUser(@RequestBody loginModel lm) {
		
	 UserModel um=	userRepo.getByUserNameAndPassWord("ash","12");
	 System.out.println(um);
	 if(um == null) {
		return  new ResponseObject("Please Check the User name and password");
	 }else {
		 return  new ResponseObject("Loigin SucessFull");
	 }
		
	}

}
