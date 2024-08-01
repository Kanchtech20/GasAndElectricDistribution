package com.distribution.Response;

import org.springframework.http.HttpStatus;

public class ApiResponse {
	
	private String message;
	private HttpStatus status;
	public ApiResponse(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	
	

}
