package com.wrn.service.imp;

public enum MessageEnum {
	
	DOES_NOT_EXIST("Does not exist"),
	ERROR("Error to redirect");
	
	private String description;

	private MessageEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
