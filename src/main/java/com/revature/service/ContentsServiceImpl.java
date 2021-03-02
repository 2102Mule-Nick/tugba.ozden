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
	public boolean takingInput(Contents contents) {	
		
		if(contentsDao.getAnswerByInput(contents)!=null) {		
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
	public Contents answering(Contents contents) {
		
		Contents existingContents=contentsDao.getAnswerByInput(contents);
		
		//if(existingContents.getUserInput()!=null)  
			
		return existingContents;	
		
		 
	}

}
