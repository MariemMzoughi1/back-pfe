/*package com.bezkoder.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(String email, String subject, String message) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("mzoughimariem64@gmail.com"); 
        mail.setSubject(subject);
        mail.setText("From: " + email + "\n\n" + message);

        emailSender.send(mail);
    }
}*/

