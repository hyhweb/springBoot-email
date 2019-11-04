package com.springboot.email;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Date;

@SpringBootTest
class EmailApplicationTests {
    @Autowired
    JavaMailSender javaMailSender;
    @Test
    public void sendSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("这是一封测试邮件");
        message.setFrom("hyhshy@163.com");
        message.setTo("hyhshy@163.com");
       message.setCc("461342854@qq.com");
        /*     message.setBcc("14xxxxx098@qq.com");*/
        message.setSentDate(new Date());
        message.setText("这是测试邮件的正文");
        javaMailSender.send(message);
    }
    @Test
    void contextLoads() {


    }

}
