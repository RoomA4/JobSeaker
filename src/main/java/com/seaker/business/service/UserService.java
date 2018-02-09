/**
 * 
 */
package com.seaker.business.service;

import java.util.List;

import com.seaker.business.bo.User;
import com.seaker.business.exception.UserException;

/**
 * @author Admin
 *
 */
public interface UserService {

	public boolean registerUser(User user) throws UserException;
	public boolean updateUser(String userId,User user) throws UserException;
	public User getUserById(String userId) throws UserException;
	public List<User> getAllUsers() throws UserException;
	public User findBySsoId(String ssoId);
}
