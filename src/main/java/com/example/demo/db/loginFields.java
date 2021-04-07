package com.example.demo.db;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loginForm")
public class loginFields {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;
	@Override
	public String toString() {
		return "loginFields [id=" + id + ", name=" + name + ", password=" + password + ", Country=" + Country
				+ ", City=" + City + ", phoneNumber=" + phoneNumber + "]";
	}
	public String name;
	public String password;
	public String Country;
	public String City;
	public String phoneNumber;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public loginFields() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
