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
	private Menu nextM;
	private Menu chatting;
	private Menu logout;


	public Menu getLogout() {
		return logout;
	}

	public void setLogout(Menu logout) {
		this.logout = logout;
	}

	public Menu getChatting() {
		return chatting;
	}

	public void setChatting(Menu chatting) {
		this.chatting = chatting;
	}

	public Scanner getScan() {
		return scan;
	}

	public Menu getNextM() {
		return nextM;
	}

	public void setNextM(Menu nextM) {
		this.nextM = nextM;
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
			System.out.println("Login process ended... ");
			System.out.println("\n");
			System.out.println("*************************************************************************");
			System.out.println("Would you like to    logout          -> 3");
			System.out.println("                     chatting        -> 4");
			System.out.println("                     update-account  -> 5");			
			System.out.println("                     remove-account  -> 6");
			
			System.out.println("*************************************************************************");
			
			String answer = scan.nextLine();
			
			if ("4".equals(answer)) {
				nextM= chatting;
			}/*
			else if ("5".equals(answer)) {
				nextM= registration;
			}*/ else if ("3".equals(answer)){
				Logout log=new Logout();
				//nextM=logout;
				log.displayOptions();
			
			}
				//else if("6".equals(answer)) {
				//nextM=remove;
			
				//System.out.println("Thank you so much. See you next time!");
				//System.exit(0);
			//}
			else {
				System.out.println("invalid input! ");
				System.out.println("*************************************************************************");
				System.out.println("If you want to do login type 1 or register type 2 or logout type 3 : ");
				nextM= this;
			}
			
					
		} catch (UserNotFound e) {
			System.out.println("Username does not exist. Please register an account.");
			this.displayOptions();
		} catch (InvalidPassword e) {
			System.out.println("Authentication error, please check username/password");
			this.displayOptions();
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong. Please try again.");
			//e.printStackTrace();
			this.displayOptions();
		} finally {
			//System.out.println("Login process ended... ");
			//this.displayOptions();
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
