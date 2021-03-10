package com.revature.ui;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.exception.UserNameTaken;
import com.revature.pojo.User;
import com.revature.service.AuthorizeService;

public class Registration implements Menu{
	Logger log =Logger.getRootLogger();
	
	private Menu welcome;

	private Menu nextM;
	
	private Scanner scan;

	private AuthorizeService authorizeService;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Registration(AuthorizeService authorizeService,Menu welcome) {
		super();
		this.authorizeService = authorizeService;
		this.welcome = welcome;		
	}
	
	@Override
	public Menu advance() {
		
		return nextM;
	}

	@Override
	public void displayOptions() {
		User user = new User();
		System.out.println("Please enter a new username :");
		user.setUserName(scan.nextLine());
		System.out.println("Please enter a new password :");
		user.setPassWord(scan.nextLine());
		if (!authorizeService.existingUser(user)) {
			try {
				authorizeService.registerUser(user);
				nextM = welcome;
			} catch (UserNameTaken e) {
				System.out.println("Username exits, please try again");
				nextM= welcome;
			}
		} else {
			log.warn("Username: "+ user.getUserName()+ "is already taken.");
			System.out.println("Username exists, please try again");
			nextM= welcome;
		}
		
	}

	public Menu getWelcome() {
		return welcome;
	}

	public void setWelcome(Menu welcome) {
		this.welcome = welcome;
	}

	public Menu getNext() {
		return nextM;
	}

	public void setNext(Menu nextM) {
		this.nextM = nextM;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public AuthorizeService getAuthorizeService() {
		return authorizeService;
	}

	public void setAuthorizeService(AuthorizeService authorizeService) {
		this.authorizeService = authorizeService;
	}

	@Override
	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scanner getScanner() {
		return scan;
	}

	@Override
	public void setScanner(Scanner scan) {
		this.scan=scan;
		
	}
	@Override
	public void answeringToUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayFirst() {
		// TODO Auto-generated method stub
		
	}
	
	

}
