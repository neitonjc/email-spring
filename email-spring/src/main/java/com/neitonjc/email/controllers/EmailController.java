package com.neitonjc.email.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neitonjc.email.dtos.EmailDTO;
import com.neitonjc.email.models.Email;
import com.neitonjc.email.services.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@PostMapping("/send")
	public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDTO emailDTO){
		Email email = new Email();
		BeanUtils.copyProperties(emailDTO, email);
		emailService.sendEmail(email);
		
		return new ResponseEntity<>(email, HttpStatus.CREATED);
	}

}
