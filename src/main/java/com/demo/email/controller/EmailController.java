package com.demo.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.email.service.EmailServic;
import com.demo.email.util.RequestModel;

@RestController
@RequestMapping("v1/mail")
public class EmailController {
    
	@Autowired
	private EmailServic emailServic;
	
	private RequestModel obj;
	
	@PostMapping("/send")
	public void mailSenderHandler(@RequestBody RequestModel obj) {
		this.obj = obj;
		printMessage();
}
	
	@Scheduled(cron = "0 0 */12 ? * *")
	public void printMessage() {

		if(obj==null) {
			return;
		}
		emailServic.sendMail(obj.getEmail(), obj.getBody(), obj.getSubject());
		System.out.println("email send sucsesfully");
		
	}
	
}
