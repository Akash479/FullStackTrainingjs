package com.example.demo.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;
	public String userName;
	public String phonenumber;
	public String passWord;
	public String cnfmPassword;
	public String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getCnfmPassword() {
		return cnfmPassword;
	}
	public void setCnfmPassword(String cnfmPassword) {
		this.cnfmPassword = cnfmPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", phonenumber=" + phonenumber + ", passWord="
				+ passWord + ", cnfmPassword=" + cnfmPassword + ", email=" + email + "]";
	}

	
	
}
