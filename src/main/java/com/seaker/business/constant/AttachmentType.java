/**
 * 
 */
package com.seaker.business.constant;

import java.util.Arrays;

/**
 * @author Admin
 *
 */
public enum AttachmentType {

	
	FILE(1),IMAGE(2),VIDEO(3);
	
	private int code;
	private AttachmentType(int code)
	{
		this.code = code;
	}
	
	public AttachmentType getforCode(int code)
	{
		return Arrays.stream(AttachmentType.values()).filter(e->e.code==code).findFirst().get(); 
	}
	
}
