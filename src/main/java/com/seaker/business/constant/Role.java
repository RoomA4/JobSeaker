/**
 * 
 */
package com.seaker.business.constant;

import java.util.Arrays;

/**
 * @author Admin
 *
 */
public enum Role {

	
	JOBSEAKER(1),EMPLOYER(2),AGENCY(3),INSTITUTION(4),ADMIN(5);
	
	private int code;
	
	private Role(int code)
	{
		this.code=code;
	}
	
	public Role forCode(int code)
	{
		return Arrays.stream(Role.values()).filter(e->e.code==code).findFirst().get();
	}
}
