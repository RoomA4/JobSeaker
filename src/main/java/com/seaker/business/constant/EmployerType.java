/**
 * 
 */
package com.seaker.business.constant;

import java.util.Arrays;

/**
 * @author Admin
 *
 */
public enum EmployerType {

	EMPLOYEER(1),ACADAMIC_INSTITUTE(2),RECRUTMENT_AJENCY(3);
	
	private int code;
	
	private EmployerType(int code)
	{
		this.code = code;
	}
	
	public EmployerType getforCode(int code)
	{
		return Arrays.stream(EmployerType.values()).filter(e->e.code==code).findFirst().get();
	}
}
