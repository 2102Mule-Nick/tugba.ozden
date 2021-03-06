package com.revature.ui;

import java.util.Scanner;

import com.revature.exception.UserNameTaken;
import com.revature.pojo.User;
import com.revature.service.AuthorizeService;

public class Registration implements Menu{
	
	private Menu welcome;

	private Menu next;
	
	private Scanner scan;

	private AuthorizeService authorizeService;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Registration(Menu welcome, AuthorizeService authorizeService) {
		super();
		this.welcome = welcome;
		this.authorizeService = authorizeService;
	}
	
	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayOptions() {
		User user = new User();
		System.out.println("Please enter a new username:");
		user.setUserName(scan.nextLine());
		System.out.println("Please enter a new password:");
		user.setPassWord(scan.nextLine());
		if (!authorizeService.existingUser(user)) {
			try {
				authorizeService.registerUser(user);
				next = null;
			} catch (UserNameTaken e) {
				System.out.println("Username exits, please try again");
				next= welcome;
			}
		} else {
			System.out.println("Username exists, please try again");
			next= welcome;
		}
		
	}

	public Menu getWelcome() {
		return welcome;
	}

	public void setWelcome(Menu welcome) {
		this.welcome = welcome;
	}

	public Menu getNext() {
		return next;
	}

	public void setNext(Menu next) {
		this.next = next;
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
	
	

}
