package com.seaker.business.exception;
/**
 * 
 */

/**
 * @author Admin
 *
 */
public class UserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
	public String getErrorMessage()
	{
		return getMessage().toString();
	}

}
