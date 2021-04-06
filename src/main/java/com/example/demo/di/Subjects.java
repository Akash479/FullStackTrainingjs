package com.example.demo.di;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subjects {
	
	public int subId;
	public String subName;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	@SuppressWarnings("deprecation")
	@Required
	//@Value("samrat")
//	@Value("${database.url}")
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	@Override
	public String toString() {
		return "Subjects [subId=" + subId + ", subName=" + subName + "]";
	}
	
	public void printC() {
		System.out.println("SubjectId:   "+subId +"   SubectName:  "+subName );
	}

}
