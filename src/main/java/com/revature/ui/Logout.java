package com.revature.ui;

import java.util.Scanner;

import com.revature.service.AuthorizeService;

public class Logout implements Menu{
	private AuthorizeService authorizeService;
	
	

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScanner(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void answeringToUser() {
		// TODO Auto-generated method stub
		
	}

}
