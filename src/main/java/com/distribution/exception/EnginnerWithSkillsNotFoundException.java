package com.distribution.exception;

public class EnginnerWithSkillsNotFoundException extends RuntimeException {
	
	private String message;

	public EnginnerWithSkillsNotFoundException(String message) {
		super();
		
		this.message = message;
	}

}
