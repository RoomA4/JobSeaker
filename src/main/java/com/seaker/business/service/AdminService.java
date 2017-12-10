/**
 * 
 */
package com.seaker.business.service;

/**
 * @author Admin
 *
 */
public interface AdminService extends UserService{

	
	public void AssignUserRole(String userId,int roleType) throws Exception;
}
