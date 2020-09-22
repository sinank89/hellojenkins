package com.ankit.mailutil;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.ankit.mailutil.service.SendEmail;

@SpringBootApplication
public class MailUtilApplication {
	
	@Autowired
    private static JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(MailUtilApplication.class, args);
		sendEmail();
	}
	
	public void run(String... args) {

        System.out.println("Sending Email...");

       

            sendEmail();
            //sendEmailWithAttachment();

         System.out.println("Done");

    }

	private static void sendEmail() {
		// TODO Auto-generated method stub
		  SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("singh.ankit8987@gmail.com");

	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("Hello World \n Spring Boot Email");

	        javaMailSender.send(msg);
		
	}

}
