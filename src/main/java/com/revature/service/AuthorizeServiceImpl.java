package com.revature.service;

import org.apache.log4j.Logger;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoPostgres;
import com.revature.exception.InvalidPassword;
import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.User;

public class AuthorizeServiceImpl implements AuthorizeService{
	Logger log =Logger.getRootLogger();
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean existingUser(User user) {
		try {
			if (userDao.getUserByUserName(user.getUserName()) != null) {
				return true;
			}
		} catch (UserNotFound e) {
			return false;
		}
		return false;
	}

	@Override
	public User authUser(User user) throws InvalidPassword, UserNotFound {
		User existingUser = userDao.getUserByUserName(user.getUserName());

		if (existingUser.getPassWord().equals(user.getPassWord())) {
			
			return existingUser;
		}

		throw new InvalidPassword();
	}

	@Override
	public User registerUser(User user) throws UserNameTaken {
		log.trace("register menu called...");
		userDao.createUser(user);
		return user;
	}

	public AuthorizeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorizeServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	

}
