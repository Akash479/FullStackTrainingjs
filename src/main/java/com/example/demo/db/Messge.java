package com.example.demo.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "fields")
//@XmlAccessorType(XmlAccessType.FIELD)
//
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Messge {

	public String me;

	public String getMe() {
		return me;
	}

	public void setMe(String me) {
		this.me = me;
	}

	public Messge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Messge(String me) {
		super();
		this.me = me;
	}
	
}
