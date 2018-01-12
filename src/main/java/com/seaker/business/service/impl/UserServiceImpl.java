/**
 * 
 */
package com.seaker.business.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seaker.business.bo.User;
import com.seaker.business.dao.UserDao;
import com.seaker.business.exception.UserException;
import com.seaker.business.service.UserService;

/**
 * @author Admin
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	
	
	
	
	@Override
	public boolean registerUser(User user) throws UserException {
		userDao.registerUser(user);
		return false;
		
	}
	
	@Override
	public boolean updateUser(String userId, User user) throws UserException {
		return false;
	}

	@Override
	public User getUserById(String userId) throws UserException {
		return null;
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		return null;
	}

}
