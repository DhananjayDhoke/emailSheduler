package com.demo.email.util;

import org.springframework.stereotype.Component;

@Component
public class RequestModel {
  
	private String email;
	private String subject;
	private String body;
	
	
	public RequestModel(String email, String subject, String body) {
		this.email=email;
		this.body=body;
		this.subject=subject;
	}


	public String getEmail() {
		return email;
	}


	public String getSubject() {
		return subject;
	}


	public String getBody() {
		return body;
	}


	public RequestModel() {
		super();
	}
}
