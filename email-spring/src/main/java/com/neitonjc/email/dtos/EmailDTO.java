package com.neitonjc.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailDTO {
	
	@NotBlank
	private String ownerRef;
	@Email
	@NotBlank
	private String emailFrom;
	@Email
	@NotBlank
	private String emailTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String messageBody;
	
	public EmailDTO(@NotBlank String ownerRef, @Email @NotBlank String emailFrom, @Email @NotBlank String emailTo,
			@NotBlank String subject, @NotBlank String messageBody) {
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.messageBody = messageBody;
	}

}
