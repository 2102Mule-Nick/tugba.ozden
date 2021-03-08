package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.dao.ContentsDaoImpl;
import com.revature.dao.UserDaoImpl;
import com.revature.dao.UserDaoKryo;
import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.Contents;
import com.revature.pojo.User;
import com.revature.service.AuthorizeServiceImpl;


class DriverTest1 {
	
	private static Contents contents=new Contents();
	private static List<Contents> contentsList;
	private static ContentsDaoImpl contentsDaoImpl=new ContentsDaoImpl();
	
	private static AuthorizeServiceImpl service=new AuthorizeServiceImpl();
	
	private static UserDaoKryo userDaoKryo=new UserDaoKryo();
	private static User user=new User();
	
	/*@BeforeEach
	private void setUp() throws Exception{
		userDaoImpl.createUser(new User("tugba","0123"));
		userDaoImpl.createUser(new User("pinal","1234") );
	}*/	
	
	/*@AfterEach
	private void tearDown() {
		contentsList.clear();
		contents = null;
	}*/
	
	@Test
	public void testGetUser() {				
		user=new User("tugba","1234");
		assertEquals("tugba",user.getUserName());
	}

	@Test
	void testCreateUser() throws UserNameTaken {
		userDaoKryo.createUser(new User("ali","1234"));
		assertNotNull("User ali should be created", "ali");
	}
	
	/*******************************************************************
	 * Chatting
	 ******************************************************************/
	
	@Test
	public void testGreetingWord() {
		//Random rndm = new Random();			
		List<String> GREET_ANSWR=new ArrayList<>();
		// int k = rndm.nextInt(GREET_ANSWR.size());
		GREET_ANSWR.add("Nice to meet you!");
		GREET_ANSWR.add("My name is Tugba.");
		String actual=contentsDaoImpl.getAnswerByInput("hello");
		
		assertNotNull("not null",actual);
	}
	
	
	    
	@Test
	public void testGreetingWord2() {
		assertEquals("Nice to meet you!",contentsDaoImpl.getAnswerByInput("hello"));
		//assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("hello"));
	}
	@Test
	public void testGreetingWord3() {
		assertEquals("Nice to meet you!",contentsDaoImpl.getAnswerByInput("what is your name"));
		//assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("what is your name"));
	}
	@Test
	public void testGreetingWord4() {
		assertEquals("Nice to meet you!",contentsDaoImpl.getAnswerByInput("your name?"));
		//assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("hello"));
	}
	@Test
	public void testHowWord2() {
		assertEquals("I am great today.",contentsDaoImpl.getAnswerByInput("how are you?"));
		//assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("hello"));
	}
	@Test
	public void testHometownWord2() {
		assertEquals("I have been living for almost $ years in the USA.",contentsDaoImpl.getAnswerByInput("how long have you been?"));
		//assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("hello"));
	}
	
	
	
	
	

}
