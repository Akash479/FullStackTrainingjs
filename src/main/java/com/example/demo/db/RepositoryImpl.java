package com.example.demo.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryImpl extends JpaRepository<employee, Integer>{
	
	
	public employee findByName(String name);
	
	

}
