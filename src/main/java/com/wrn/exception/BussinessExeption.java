package com.wrn.exception;

public class BussinessExeption extends Exception {

	private static final long serialVersionUID = 1L;
	
	private final String errorMessage;

	public BussinessExeption(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
