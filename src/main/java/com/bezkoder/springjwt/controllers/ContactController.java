/*package com.bezkoder.springjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private JavaMailSender emailSender;

    @PostMapping("/contact")
    public String sendEmail(@RequestParam String email, @RequestParam String subject, @RequestParam String message) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("mzoughimariem64@gmail.com"); // Owner's email address
        mail.setSubject(subject);
        mail.setText("From: " + email + "\n\n" + message);

        emailSender.send(mail);

        return "Message sent successfully";
    }
}*/
