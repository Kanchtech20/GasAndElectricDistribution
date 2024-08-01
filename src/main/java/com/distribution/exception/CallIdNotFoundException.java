package com.distribution.exception;

import org.springframework.http.HttpStatus;

public class CallIdNotFoundException extends RuntimeException{
	
	private String callId;
	private String message;
	private HttpStatus status;
	
	public CallIdNotFoundException(String callId, String message, HttpStatus status) {
		super();
		this.callId = callId;
		this.message = message;
		this.status = status;
	}
	
	

}
