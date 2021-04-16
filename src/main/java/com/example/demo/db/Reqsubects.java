package com.example.demo.db;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Reqsubects {
	
	
	public int id;
	public String subjName;
	public String marks;
	public String Date;
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
	@Override
	public String toString() {
		return "Reqsubects [id=" + id + ", subjName=" + subjName + ", marks=" + marks + ", Date=" + Date + "]";
	}
	public Reqsubects(int id, String subjName, String marks, String date) {
		super();
		this.id = id;
		this.subjName = subjName;
		this.marks = marks;
		Date = date;
	}
	


}
