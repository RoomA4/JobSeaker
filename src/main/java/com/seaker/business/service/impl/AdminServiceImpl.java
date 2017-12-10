/**
 * 
 */
package com.seaker.business.service.impl;

import java.util.List;

import com.seaker.business.bo.User;
import com.seaker.business.exception.UserException;
import com.seaker.business.service.AdminService;

/**
 * @author Admin
 *
 */
public class AdminServiceImpl implements AdminService {

	/* (non-Javadoc)
	 * @see com.seaker.business.service.UserService#registerUser(com.seaker.business.bo.User)
	 */
	@Override
	public boolean registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.seaker.business.service.UserService#updateUser(java.lang.String, com.seaker.business.bo.User)
	 */
	@Override
	public boolean updateUser(String userId, User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.seaker.business.service.UserService#getUserById(java.lang.String)
	 */
	@Override
	public User getUserById(String userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.seaker.business.service.UserService#getAllUsers()
	 */
	@Override
	public List<User> getAllUsers() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.seaker.business.service.AdminService#AssignUserRole(java.lang.String, int)
	 */
	@Override
	public void AssignUserRole(String userId, int roleType) throws Exception {
		// TODO Auto-generated method stub

	}

}
