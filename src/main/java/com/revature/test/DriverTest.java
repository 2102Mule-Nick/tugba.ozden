package com.revature.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.dao.ContentsDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.dao.UserDaoKryo;
import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.Contents;
import com.revature.pojo.User;
import com.revature.service.AuthorizeService;
import com.revature.service.AuthorizeServiceImpl;

public class DriverTest {
	
	private static Contents contents;
	private static List<Contents> contentsList;
	
	private static AuthorizeServiceImpl service;
	
	private static UserDaoImpl userDaoImpl;
	
	@BeforeEach
	private void setUp() throws Exception{
		userDaoImpl.createUser(new User("tugba","0123"));
		userDaoImpl.createUser(new User("pinal","1234") );
	}
	
	
	
	/*@AfterEach
	private void tearDown() {
		contentsList.clear();
		contents = null;
	}*/
	
	@Test
	public void testGetUserByUserName() throws UserNotFound {
		User userTest=userDaoImpl.getUserByUserName("tugba");
		assertEquals(userTest,userDaoImpl.getUserByUserName("tugba"));
	}
	
	
	@Test
	void itemIsAddedToContents()  {
		
		//AAA Pattern for testing
		
		//Arrange
		ContentsDaoImpl c=new ContentsDaoImpl();
		Contents contents= new Contents();
		
		//Act
		c.getAnswerByInput("What can I do for you?");
		
		//Assert
		assertEquals("Contents should have 1 item in it", 1, contents.getAnswers().size());
		
	}	
	
	@Test
	public void getUserList() {
		assertEquals(2,userDaoImpl.getAllUsers().size());
	}
	
	@Test
	public void getAllUsers() throws UserNameTaken, UserNotFound {
		UserDaoKryo kry=new UserDaoKryo();
		kry.createUser(userDaoImpl.getUserByUserName("mehmet"));
		for(User user:kry.getAllUsers()) {
			System.out.println(user.toString());
		}
		assertEquals(userDaoImpl.getAllUsers(),kry.getAllUsers());		
	}
	
	

	
		
	
	

}
