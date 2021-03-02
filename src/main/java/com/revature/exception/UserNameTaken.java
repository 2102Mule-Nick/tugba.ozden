package com.revature.exception;

public class UserNameTaken extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNameTaken() {
		super();
		
	}

	public UserNameTaken(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public UserNameTaken(String message, Throwable cause) {
		super(message, cause);
	
	}

	public UserNameTaken(String message) {
		super(message);
		
	}

	public UserNameTaken(Throwable cause) {
		super(cause);
		
	}

}
