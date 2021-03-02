package com.revature.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.User;

public class UserDaoImpl implements UserDao {
	
	public static List<User> userList;

	@Override
	public void createUser(User user) throws UserNameTaken {
		
	if (user.getUserName() != null && user.getPassWord() != null) {
			
			Iterator<User> iter = userList.iterator();
			
			while (iter.hasNext()) {
				if (iter.next().getUserID().equals(user.getUserID())) {
					throw new UserNameTaken("This username is taken");
				}
			}	
			
			userList.add(user);			
		}
		
	}

	@Override
	public User getUserByUserName(String userName) throws UserNotFound {
		Iterator<User> iter = userList.iterator();		
		while (iter.hasNext()) {			
			User existingUser = iter.next();
			if (existingUser.getUserName().equalsIgnoreCase(userName)) {
				return existingUser;
			}
		}
		
		throw new UserNotFound();		
		//return null;
	}

	public UserDaoImpl() {
		super();
		userList = new ArrayList<>();
		userList.add(new User("1", "tugba", "0123"));
		userList.add(new User("2","pinal", "4567"));
		userList.add(new User("3","amy", "8910"));
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	

}
