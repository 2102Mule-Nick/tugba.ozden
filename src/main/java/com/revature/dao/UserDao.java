package com.revature.dao;


import java.util.List;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.User;

public interface UserDao {
	
	public void createUser(User user) throws UserNameTaken;
	public User getUserByUserName(String userName) throws UserNotFound;
	public List <User> getAllUsers();
	public void removeUser(User user);
	public void updateUser(User user);
}
