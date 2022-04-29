package com.emailApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {


    @Autowired
    JavaMailSender mailSender;

    public void sendEmail(String toEmail, String body, String subject) {

       // EmailMessage message = new EmailMessage();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("muqtarmav@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
        System.out.println("mail sent successfully.....");

    }

}
