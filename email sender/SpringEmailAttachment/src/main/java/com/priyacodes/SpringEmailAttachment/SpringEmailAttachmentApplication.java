package com.priyacodes.SpringEmailAttachment;


import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringEmailAttachmentApplication {
	@Autowired
	private EmailSenderService emailSenderService;


	public static void main(String[] args) {
		SpringApplication.run(SpringEmailAttachmentApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException, MessagingException {
		emailSenderService.sendMailWithAttachment("biswside@gmail.com",
				"This is email body.",
				"This email subject", "" )

		;

	}

}