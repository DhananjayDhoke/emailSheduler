package com.demo.email.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public interface EmailServic {
	@Scheduled(cron = "0 * * ? * *")
	void sendMail(String to, String body, String subject);
}
