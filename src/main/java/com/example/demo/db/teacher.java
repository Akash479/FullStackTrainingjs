package com.example.demo.db;

import org.springframework.stereotype.Component;

public class teacher {
	
	public teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "teacher [id=" + id + ", name=" + name + "]";
	}
	public teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
