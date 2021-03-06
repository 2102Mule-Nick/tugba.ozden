package com.revature.ui;

import java.util.Scanner;

public class Welcome implements Menu {
	
	
	Scanner scan=new Scanner(System.in);
	
	private Menu login;
	
	private Menu registration;
	
	private Menu nextM;	
	
	public Welcome(Menu chatting) {
		super();
	}

	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Welcome(Menu login, Menu registration) {
		super();
		this.login = login;
		this.registration = registration;
	}

	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return nextM;
	}

	@Override
	public void displayOptions() {
		System.out.println("*************************************************************************");
		System.out.println("***** THIS CHATTING IS CREATED FOR IMPROVING BASIC ENGLISH SKILLS. *****");
		System.out.println("*****                                                              *****");
		System.out.println("*****               WELCOME TO OUR CHATTING PROGRAM                *****");
		System.out.println("*****                                                              *****");
		System.out.println("*************************************************************************");
		//System.out.println("Welcome to Chating");
		System.out.println("*************************************************************************");
		System.out.println("Would you like to login or register?");
		System.out.println("If you want to do login type 1 or register type 2 : ");
		System.out.println("*************************************************************************");
		//System.out.println("register");
		String answer = scan.nextLine();
		
		if ("1".equals(answer)) {
			nextM= login;
		} else if ("2".equals(answer)) {
			nextM= registration;
		} else {
			System.out.println("invalid input! ");
			System.out.println("*************************************************************************");
			System.out.println("If you want to do login type 1 or register type 2 : ");
			nextM= this;
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
		return this.scan;
	}

	@Override
	public void setScanner(Scanner scan) {
		 this.scan=scan;
		
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public Menu getLogin() {
		return login;
	}

	public void setLogin(Menu login) {
		this.login = login;
	}

	public Menu getRegistration() {
		return registration;
	}

	public void setRegistration(Menu registration) {
		this.registration = registration;
	}

	public Menu getNext() {
		return nextM;
	}

	public void setNext(Menu next) {
		this.nextM = next;
	}

	@Override
	public void answeringToUser() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
