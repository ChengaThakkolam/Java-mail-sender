package com.example.demo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.services.EmailSenderService;

@SpringBootApplication
public class SpringMailSenderApplication {

	static{
		System.out.println("Java Mail Sender App");
	}
	
	int i=a;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMailSenderApplication.class, args);
	}
	
	
	

}
