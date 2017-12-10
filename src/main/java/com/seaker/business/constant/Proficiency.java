/**
 * 
 */
package com.seaker.business.constant;

import java.util.Arrays;

/**
 * @author Admin
 *
 */
public enum Proficiency {
	
	EASY(1),MEDIUM(2),HIGH(3);

	private int code;
	
	private Proficiency(int code) {
		this.code = code;
	}
	
	public Proficiency getforCode(int code)
	{
		return Arrays.stream(Proficiency.values()).filter(e->e.code==code).findFirst().get(); 
	}
	
}
