package com.springboot.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EmailController {
    @Autowired
    JavaMailSender javaMailSender;

    @GetMapping("/sendEmail")
    public String sendSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("这是一封测试邮件");
        message.setFrom("hyhshy@163.com");
        message.setTo("hyhshy@163.com");
        message.setCc("461342854@qq.com");
        /*     message.setBcc("14xxxxx098@qq.com");*/
        message.setSentDate(new Date());
        message.setText("这是测试邮件的正文");
        javaMailSender.send(message);
        return "success send";
    }
}
