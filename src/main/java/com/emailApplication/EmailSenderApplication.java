package com.emailApplication;

import com.emailApplication.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {

	@Autowired
	EmailSenderService emailSenderService;


	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void enableMail(){
		emailSenderService.sendEmail("muqtarmav@gmail.com",
				"This is a email body....",
				"I just created a springboot application to send you this email");
	}

}
