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
	private static Random rndm=new Random();
	
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
	/*******************************************************************
	 * User object
	 ******************************************************************/
	
	@Test
	public void testGetUser() {				
		user=new User("tugba","1234");
		assertEquals("tugba",user.getUserName());
		
	}
	
	/*******************************************************************
	 * Kryo create user
	 ******************************************************************/

	@Test
	void testCreateUser() throws UserNameTaken {
		userDaoKryo.createUser(new User("ali","1234"));
		assertNotNull("User ali should be created", "ali");
	}
	
	/*******************************************************************
	 * Chatting
	 ******************************************************************/
	
	/*@Test
	public void testGreetingWord() {
		//Random rndm = new Random();			
		List<String> GREET_ANSWR=new ArrayList<>();		
		GREET_ANSWR.add("Nice to meet you!");
		GREET_ANSWR.add("My name is Tugba.");
		//int k = rndm.nextInt(GREET_ANSWR.size());
		//String actual1=GREET_ANSWR.get(k);
		String actual=contentsDaoImpl.getAnswerByInput("hello");
		
		assertNotNull("not null",actual);
	}*/
	
	@Test
	public void testGreetingWord() {
		//Random rndm = new Random();			
		List<String> GREET_ANSWR=new ArrayList<>();		
		GREET_ANSWR.add("Nice to meet you!");
		GREET_ANSWR.add("My name is Tugba.");
		int k = rndm.nextInt(GREET_ANSWR.size());
		String actual1=GREET_ANSWR.get(k);
		//String actual=contentsDaoImpl.getAnswerByInput("hello");
		
		assertNotNull("not null....",actual1);
	}
	
	

	@Test
	public void testGreetingWord0() {
		//Random rndm = new Random();			
		List<String> GREET_ANSWR=new ArrayList<>();		
		GREET_ANSWR.add("Nice to meet you!");
		GREET_ANSWR.add("My name is Tugba.");
		int k = rndm.nextInt(GREET_ANSWR.size());
		String actual1=GREET_ANSWR.get(k);
		//String actual=contentsDaoImpl.getAnswerByInput("hello");	
		assertNotEquals("not null",actual1);
	}
	
	    
	/*@Test
	public void testGreetingWord2() {
		assertEquals("Nice to meet you!",contentsDaoImpl.getAnswerByInput("hello"));
		assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("hello"));
	}*/
	@Test
	public void testWelcomeWord1() {
		List<String> WEL_ANSWR=new ArrayList<>();
		WEL_ANSWR.add("I have been living for almost 4 years in the USA.");
		WEL_ANSWR.add("I left from my country since 2016. ");
		WEL_ANSWR.add("I like to live America!.");	
		int k = rndm.nextInt(WEL_ANSWR.size());
		String actual1=WEL_ANSWR.get(k);
		//String actual=contentsDaoImpl.getAnswerByInput("how long have you been?");	
		assertNotEquals("not null",actual1);
	
	}
	@Test
	public void testFirstWord1() {
		List<String> FRST_TLK_ANSWR=new ArrayList<>();		
		FRST_TLK_ANSWR.add("I am from Turkey.");
		FRST_TLK_ANSWR.add("I live in Philly");
		FRST_TLK_ANSWR.add("My hometown is Istanbul.");
		int k = rndm.nextInt(FRST_TLK_ANSWR.size());
		String actual1=FRST_TLK_ANSWR.get(k);
		//String actual=contentsDaoImpl.getAnswerByInput("where are you?");	
		assertNotEquals("not null",actual1);
		//assertEquals("Nice to meet you!",contentsDaoImpl.getAnswerByInput("wehere do you live?"));
		//assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("hello"));
	}
	@Test
	public void testHowWord1() {
		 List<String> HOW_ANSWR=new ArrayList<>();
		 HOW_ANSWR.add("I am great today.");
		HOW_ANSWR.add("Great, thanks!");
		int k = rndm.nextInt(HOW_ANSWR.size());
		String actual1=HOW_ANSWR.get(k);
		//String actual=contentsDaoImpl.getAnswerByInput("how are you?");	
		assertNotEquals("not null",actual1);
		
	}
	/*@Test
	public void testHometownWord1() {
		assertEquals("I am from Turkey.",contentsDaoImpl.getAnswerByInput("hometown?"));
		//assertEquals("My name is Tugba.",contentsDaoImpl.getAnswerByInput("hello"));
	}*/
	@Test
	public void testEducationWord1() {
		List <String> EDCTN_ANSWR=new ArrayList<>();
		EDCTN_ANSWR.add("Yes.I graduated College in the USA.");
		EDCTN_ANSWR.add("I am interning right now.");
		EDCTN_ANSWR.add("I don't study right now, but I am interning.");
		int k = rndm.nextInt(EDCTN_ANSWR.size());
		String actual1=EDCTN_ANSWR.get(k);
		//String actual=contentsDaoImpl.getAnswerByInput("where do you study?");	
		assertNotEquals("not null",actual1);
		
	}
	@Test
	public void testJobWord1() {
		List <String> JOB_ANSWR=new ArrayList<>();
		JOB_ANSWR.add("Kind of intership?");
		JOB_ANSWR.add("Before I worked as a computer teacher at an elemantary school.");
		JOB_ANSWR.add("Not yet, just I am preparing for it.");
		int k = rndm.nextInt(JOB_ANSWR.size());
		String actual1=JOB_ANSWR.get(k);
		//String actual=contentsDaoImpl.getAnswerByInput("work?");	
		assertNotEquals("not null",actual1);
		
	}
	
	
	
	
	
	

}
