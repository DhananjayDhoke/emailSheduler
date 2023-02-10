package com.demo.email.sheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.email.controller.EmailController;
import com.demo.email.service.EmailServic;
import com.demo.email.util.RequestModel;

public class Sheduler {
   
	@Autowired
	private EmailController controller;
	
	
	public void sendEmail() {
		controller.mailSenderHandler(null);
	}
	
}
