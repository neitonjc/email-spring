package com.neitonjc.email.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.neitonjc.email.enums.StatusEmail;
import com.neitonjc.email.models.Email;
import com.neitonjc.email.repositories.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;
	
	@Autowired
	private JavaMailSender emailSender;

	@SuppressWarnings("finally")
	public Email sendEmail(Email email) {
		email.setSendDate(LocalDateTime.now());
		
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setFrom(email.getEmailFrom());
			msg.setTo(email.getEmailTo());
			msg.setSubject(email.getSubject());
			msg.setText(email.getMessageBody());
			emailSender.send(msg);
			
			email.setStatus(StatusEmail.SENT);
		} catch (MailException e) {
			email.setStatus(StatusEmail.ERROR);
		} finally {
			return emailRepository.save(email);
		}
	}
}
