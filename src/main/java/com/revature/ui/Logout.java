package com.revature.ui;

import java.util.Scanner;

import com.revature.service.AuthorizeService;

public class Logout implements Menu{
	private AuthorizeService authorizeService;
	private Scanner scan;
	

	public Logout() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Logout(AuthorizeService authorizeService) {
		super();
		this.authorizeService = authorizeService;
	}
	public AuthorizeService getAuthorizeService() {
		return authorizeService;
	}

	public void setAuthorizeService(AuthorizeService authorizeService) {
		this.authorizeService = authorizeService;
	}

	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayOptions() {
		System.out.println("Are you sure for logout? type yes");
		String input=scan.nextLine();
		if(input.toLowerCase().equals("yes")) {
			System.exit(0);
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
	public void answeringToUser() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void displayFirst() {
		// TODO Auto-generated method stub
		
	}

}
