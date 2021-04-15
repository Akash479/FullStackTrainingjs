package com.example.demo.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Subjectmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;
	public String subjName;
	public String marks;
	public String Date;
	@ManyToOne
	public UserModel us;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public UserModel getUs() {
		return us;
	}
	public void setUs(UserModel us) {
		this.us = us;
	}
	public Subjectmodel(int id, String subjName, String marks, String date, UserModel us) {
		super();
		this.id = id;
		this.subjName = subjName;
		this.marks = marks;
		Date = date;
		this.us = us;
	}
	@Override
	public String toString() {
		return "Subjectmodel [id=" + id + ", subjName=" + subjName + ", marks=" + marks + ", Date=" + Date + ", us="
				+ us + "]";
	}
	
	

}
