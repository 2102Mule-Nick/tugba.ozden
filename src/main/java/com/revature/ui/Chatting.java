package com.revature.ui;

import java.util.Scanner;

import com.revature.pojo.Contents;
import com.revature.service.AuthorizeService;
import com.revature.service.ContentsService;
import com.revature.service.ContentsServiceImpl;

public class Chatting implements Menu{
	private AuthorizeService authorizeService;
	private ContentsServiceImpl contentsService;
	Scanner scan = new Scanner(System.in);	
	
	

	public Chatting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Chatting(AuthorizeService authorizeService, ContentsServiceImpl contentsService, Scanner scan) {
		super();
		this.authorizeService = authorizeService;
		this.contentsService = contentsService;
		this.scan = scan;
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



	public void setContentsService(ContentsServiceImpl contentsService) {
		this.contentsService = contentsService;
	}



	public Scanner getScan() {
		return scan;
	}



	public void setScan(Scanner scan) {
		this.scan = scan;
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
		System.out.println();
		String machineAnswer="Hello";
		System.out.println("Machine : " + machineAnswer );
		String input;		
		input=scan.nextLine();	
		Contents contents=new Contents(input);
		contents.setUserInput(input);
		contents=contentsService.answering(contents);	
				machineAnswer="Machine : " + contents.getMachineAnswer();
		
	}	

}
