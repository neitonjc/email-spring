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
		super();
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.messageBody = messageBody;
	}

	public String getOwnerRef() {
		return ownerRef;
	}

	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailFrom == null) ? 0 : emailFrom.hashCode());
		result = prime * result + ((emailTo == null) ? 0 : emailTo.hashCode());
		result = prime * result + ((messageBody == null) ? 0 : messageBody.hashCode());
		result = prime * result + ((ownerRef == null) ? 0 : ownerRef.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailDTO other = (EmailDTO) obj;
		if (emailFrom == null) {
			if (other.emailFrom != null)
				return false;
		} else if (!emailFrom.equals(other.emailFrom))
			return false;
		if (emailTo == null) {
			if (other.emailTo != null)
				return false;
		} else if (!emailTo.equals(other.emailTo))
			return false;
		if (messageBody == null) {
			if (other.messageBody != null)
				return false;
		} else if (!messageBody.equals(other.messageBody))
			return false;
		if (ownerRef == null) {
			if (other.ownerRef != null)
				return false;
		} else if (!ownerRef.equals(other.ownerRef))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	
	
	

}
