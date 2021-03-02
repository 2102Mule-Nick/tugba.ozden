package com.revature.dao;

import java.util.List;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.UserDetails;

public interface UserDetailsDao {
	
	public void createUserDetails(UserDetails userDetails) throws UserNameTaken;
	public UserDetails getUserByNickName(String userName) throws UserNotFound;
	public List <UserDetails> getAllUsersDetails();
	public void removeUserDetails(UserDetails userDetails);
	public void updateUserDetails(UserDetails userDetails);
	
	

}
