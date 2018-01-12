/**
 * 
 */
package com.seaker.business.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seaker.business.bo.User;
import com.seaker.business.dao.UserDao;

/**
 * @author Admin
 *
 */
@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean registerUser(User user) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean updateUser(String userId, User user) {
		return false;
	}

	@Override
	public User getUserById(String userId) {
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
