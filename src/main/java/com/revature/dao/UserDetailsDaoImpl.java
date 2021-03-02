package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.UserDetails;

public class UserDetailsDaoImpl implements UserDetailsDao {
	public static List<UserDetails> userList;

	@Override
	public void createUserDetails(UserDetails userDetails) throws UserNameTaken {			
			userList = new ArrayList<>();
			userList.add(new UserDetails("tugba", "ozden","tooba","tugba@gmail.com"));
			userList.add(new UserDetails("pinal", "ozden","pinal","pinal@gmail.com"));
			userList.add(new UserDetails("amy", "ozden","amy","amy@gmail.com"));			
		}	

	@Override
	public UserDetails getUserByNickName(String userName) throws UserNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetails> getAllUsersDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		
	}
	

}
