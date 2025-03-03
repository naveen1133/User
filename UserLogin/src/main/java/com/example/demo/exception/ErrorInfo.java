package com.example.demo.exception;

import java.time.LocalDateTime;

public class ErrorInfo {
     LocalDateTime timestamp;
     String message;
     String url;
     String validationMessage;
	public ErrorInfo(LocalDateTime timestamp, String message, String url, String validationMessage) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.url = url;
		this.validationMessage = validationMessage;
	}
     
	public ErrorInfo()
	{
		super();
	}
	public ErrorInfo(LocalDateTime timestamp, String message, String url) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.url = url;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getValidationMessage() {
		return validationMessage;
	}

	public void setValidationMessage(String validationMessage) {
		this.validationMessage = validationMessage;
	}
}

