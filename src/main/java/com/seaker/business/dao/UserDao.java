/**
 * 
 */
package com.seaker.business.dao;

import java.util.List;

import com.seaker.business.bo.User;

/**
 * @author Admin
 *
 */
public interface UserDao {

	
	public boolean registerUser(User user) ;
	public boolean updateUser(String userId,User user) ;
	public User getUserById(String userId) ;
	public List<User> getAllUsers();
}
