package com.revature.ui;

import java.util.Scanner;

import com.revature.exception.InvalidPassword;
import com.revature.exception.UserNotFound;
import com.revature.pojo.Contents;
import com.revature.pojo.User;
import com.revature.service.AuthorizeService;
import com.revature.service.ContentsService;

public class Login implements Menu {
	private AuthorizeService authorizeService;
	private ContentsService contentsService;
	private Scanner scan;		
	

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Login(AuthorizeService authorizeService) {
		super();
		this.authorizeService = authorizeService;
	}

	public AuthorizeService getAuthorizeService() {
		return authorizeService;
	}

	public void setAuthorizeService(AuthorizeService authorizeService) {
		this.authorizeService = authorizeService;
	}	
	
	public ContentsService getContentsService() {
		return contentsService;
	}

	public void setContentsService(ContentsService contentsService) {
		this.contentsService = contentsService;
	}

	@Override
	public Menu advance() {
		return null;		
	}
	
	@Override
	public void answeringToUser() {
				
	}

	@Override
	public void displayOptions() {
		System.out.println("Please Enter Username");
		String userName = scan.nextLine();
		System.out.println("Please Enter Password");
		String passWord = scan.nextLine();
		
		User user = new User(userName, passWord);		
		
		try {
			authorizeService.authUser(user);
			System.out.println("Login is happend succsesfully!");
			System.out.println("Welcome to Chat " + user.getUserName());
			//answeringToUser();
			
			
		} catch (UserNotFound e) {
			System.out.println("Username does not exist. Please register an account.");
		} catch (InvalidPassword e) {
			System.out.println("Authentication error, please check username/password");
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong. Please try again.");
			e.printStackTrace();
		} finally {
			System.out.println("...");
		}
		
	}

	@Override
	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return scan;
	}

	@Override
	public void setScanner(Scanner scan) {
		this.scan=scan;
		
	}

	@Override
	public void displayFirst() {
		// TODO Auto-generated method stub
		
	}	

}
