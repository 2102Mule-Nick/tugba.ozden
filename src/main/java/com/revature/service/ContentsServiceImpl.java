package com.revature.service;

import java.util.Scanner;

import com.revature.dao.ContentsDaoImpl;
import com.revature.exception.InvalidPassword;
import com.revature.exception.UserNotFound;
import com.revature.pojo.Contents;
import com.revature.pojo.User;

public class ContentsServiceImpl implements ContentsService {
	private ContentsDaoImpl contentsDao;	

	public ContentsDaoImpl getContentsDao() {
		return contentsDao;
	}

	public void setContentsDao(ContentsDaoImpl contentsDao) {
		this.contentsDao = contentsDao;
	}
	

	@Override
	public boolean takingInput(String input) {	
		
		if(contentsDao.getAnswerByInput(input)!=null) {		
				return true;
	}return false;
	}
	/*@Override
	public User authenticateUser(User user) throws InvalidPassword, UserNotFound {

		User existingUser = userDao.getUserByUsername(user.getUsername());

		if (existingUser.getPassword().equals(user.getPassword())) {
			return existingUser;
		}

		throw new InvalidPassword();
	}*/
	@Override
	public String answering(String  input) {	
		
		String existingContents=contentsDao.getAnswerByInput(input);
		
		if(input!=null) return existingContents; 
			
		else return "Please enter your answer!"	;
		
		 
	}

}
