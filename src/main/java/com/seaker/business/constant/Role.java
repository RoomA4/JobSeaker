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

	
	JOBSEAKER(0),EMPLOYER(1),ADMIN(2);
	
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
