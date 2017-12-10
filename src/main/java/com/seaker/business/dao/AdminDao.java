/**
 * 
 */
package com.seaker.business.dao;

/**
 * @author Admin
 *
 */
public interface AdminDao {

	public void AssignUserRole(String userId,int roleType) throws Exception;
}
