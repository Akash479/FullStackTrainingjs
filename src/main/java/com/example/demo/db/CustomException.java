package com.example.demo.db;

public class CustomException extends Exception {
	
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomException(String message) {
		super();
		this.message = message;
	}
	
	

}
