package com.seaker.business.constant;

import java.util.Arrays;

public enum UserType {

	
	Fresher(0),Professional(1);
	
	private int code;
	
	private UserType(int code) {
		this.code = code;
	}
	
	public UserType forCode(int code) {
		return Arrays.stream(UserType.values()).filter(e->e.code == code).findFirst().get();
	}
}
