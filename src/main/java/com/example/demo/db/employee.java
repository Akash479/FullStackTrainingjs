package com.example.demo.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	public int id;
	@Column(name="name")
	public String  name;
	@Column(name="Salary")
	public Long Salary;
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
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
