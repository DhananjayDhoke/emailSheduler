package com.demo.email.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.demo.email.service.EmailServic;

@Service
public class EmailServiceImpl implements EmailServic{

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void sendMail(String to,String body, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("dhananjaydhoke33@gmail.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(body);

		mailSender.send(message);
		System.out.println("mail send sucessfully");

	}

}
