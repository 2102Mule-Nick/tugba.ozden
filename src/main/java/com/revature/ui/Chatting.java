package com.revature.ui;

import java.util.Random;
import java.util.Scanner;

import com.esotericsoftware.kryo.io.Input;
import com.revature.dao.ContentsDaoImpl;
import com.revature.pojo.Contents;
import com.revature.service.AuthorizeService;
import com.revature.service.ContentsService;
import com.revature.service.ContentsServiceImpl;

public class Chatting implements Menu{
	
	private ContentsServiceImpl contentsService;
	private Scanner scan;	
	private Menu login;
	private Menu welcome;
	private Menu nextM;
	private AuthorizeService authorizeService;
	

	public Chatting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chatting(ContentsServiceImpl contentsService, Menu welcome, AuthorizeService authorizeService) {
		super();		
		this.contentsService = contentsService;
		this.contentsService=contentsService;
		this.authorizeService=authorizeService;
	}

	public ContentsService getContentsService() {
		return contentsService;
	}

	public void setContentsService(ContentsServiceImpl contentsService) {
		this.contentsService = contentsService;
		
	}

	public Menu getLogin() {
		return login;
	}

	public void setLogin(Menu login) {
		this.login = login;
	}	

	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return nextM;
	}

	@Override
	public void displayOptions() {
		ContentsDaoImpl contentsDaoImpl = new ContentsDaoImpl();
		
		String answer = "...";
		System.out.println();
		// String machineAnswer="Hello";
		// System.out.println("Machine : " + machineAnswer );
		 String input;
		
		
		System.out.print("User  :  ");
		 input = scan.nextLine();
		answer = "..............";
		answer = contentsDaoImpl.getAnswerByInput(input);
		
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
	
	@Override
	public void answeringToUser() {	 
		
	}

	public Menu getWelcome() {
		return welcome;
	}

	public void setWelcome(Menu welcome) {
		this.welcome = welcome;
	}

	@Override
	public void displayFirst() {
		// TODO Auto-generated method stub
		
	}
		 
}//}


