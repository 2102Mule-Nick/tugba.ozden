package com.revature.ui;

import java.util.Random;
import java.util.Scanner;

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
	
	

	public Chatting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chatting(ContentsServiceImpl contentsService, Menu welcome) {
		super();		
		this.contentsService = contentsService;
		this.contentsService=contentsService;		
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
		ContentsDaoImpl contentsDaoImpl=new ContentsDaoImpl();
		 String answer="...";
			System.out.println();
			String machineAnswer="Hello";
			//System.out.println("Machine : " + machineAnswer );
			//String input;	
			System.out.print("User  :  ");
			String input=scan.nextLine();	
			//Contents contents=new Contents(input);
			//contents.setUserInput(input);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 			
					//Random rndm = new Random();			
					
			    	/*try {
			    		Thread.sleep(1000);	
			    		System.out.println("Machine is typing.....");
			    		Thread.sleep(1000);	
			    	}catch (InterruptedException e) {
						e.printStackTrace();
				    	}*/		    					    	  
				    	 	//if(1<contentsDaoImpl.GREETING.size() && input.contains(contentsDaoImpl.GREETING.get(1))) {			    			
				    	    	//if( input.contains("Hello") || input.contains("hi") || input.contains("Hi")) {
				    				//int k = rndm.nextInt(3);
				    				//System.out.println(k);
				    	    		answer="..............";
					    			answer=contentsDaoImpl.getAnswerByInput(input);
					    			//System.out.println("Machine  :"+  answer);
					    			
				    	    	//}else System.out.println("Machine : I didn't understand...");
				    	 
						
			//System.out.println("Machine : " + contentsService.answering(input));
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


