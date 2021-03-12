package com.revature.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.revature.pojo.Answer;
import com.revature.pojo.Contents;
import com.revature.pojo.User;
import com.revature.ui.Logout;
import com.revature.ui.Welcome;

public class ContentsDaoImpl {	
	
	 /*final static List<String> INPUT_LIST = new ArrayList<>();
	
	 final static List<String> GREETING=new ArrayList<>();
	
     final static List<String> GREET_ANSWR=new ArrayList<>();
	
	 final static List<String> HOW=new ArrayList<>();
	
	final static List<String> HOW_ANSWR=new ArrayList<>();
	
	final static List<String> WELCOME=new ArrayList<>();
	final static List<String> WEL_ANSWR=new ArrayList<>();
	
	final static List<String> FIRST_TALK=new ArrayList<>();
	final static List<String> FRST_TLK_ANSWR=new ArrayList<>();
	
	final static List <String> EDUCATION=new ArrayList<>();
	final static List <String> EDCTN_ANSWR=new ArrayList<>();
	
	final static List <String> JOB=new ArrayList<>();

	final static List <String> JOB_ANSWR=new ArrayList<>();
	
	
	//public static List<Contents> getContentsList() {
		
		//return _LIST;
	//}*/
	//public static void createContents() {	
		
		
	//}
	
	public String getAnswerByInput(String input) {	
		String answer="...";
		boolean stopLoop=true;
		Scanner scan=null;
		
		/*GREETING.add("hello");
		GREETING.add("what is your name?");
		GREETING.add("your name?");
		GREETING.add("tell me about yourself?");
		
		GREET_ANSWR.add("Nice to meet you!");
		GREET_ANSWR.add("My name is Tugba.");
		//GREET_ANSWR.add("i am fine?");
		//GREET_ANSWR.add("");	
		
		HOW.add("how are you today?");
		HOW.add("how are you?");
		HOW.add("how is your doing?");
		
		HOW_ANSWR.add("I am great today.");
		HOW_ANSWR.add("Great, thanks!");	
		
		WELCOME.add("how long have you been?");
		WELCOME.add("how long have you been in the USA?");
		WELCOME.add("when did you come in the USA?");
		WELCOME.add("when did leave from your country?");	
		
		WEL_ANSWR.add("I have been living for almost 4 years in the USA.");
		WEL_ANSWR.add("I left from my country since 2016. ");
		WEL_ANSWR.add("I like to live America!.");	
		
		
		FIRST_TALK.add("hometown?");
		FIRST_TALK.add("what is your hometown?");
		FIRST_TALK.add("where do you live?");
		FIRST_TALK.add("where are you?");
		
		FRST_TLK_ANSWR.add("I am from Turkey.");
		FRST_TLK_ANSWR.add("I live in Philly");
		FRST_TLK_ANSWR.add("My hometown is Istanbul.");		
		
		EDUCATION.add("where do you study?");
		EDUCATION.add("do you study right now?");		
		EDUCATION.add("did you graduate from College?");
		
		
		EDCTN_ANSWR.add("Yes.I graduated College in the USA.");
		EDCTN_ANSWR.add("I am interning right now.");
		EDCTN_ANSWR.add("I don't study right now, but I am interning.");
		
		JOB.add("do you work?");
		JOB.add("work?");
		JOB.add("are you working?");
		JOB.add("what kind of job did you work before?");
		
		JOB_ANSWR.add("Kind of intership?");
		JOB_ANSWR.add("Before I worked as a computer teacher at an elemantary school.");
		JOB_ANSWR.add("Not yet, just I am preparing for it.");
		
		
				//contents=new Contents();	
		/*String answer="......";
		if(input.equalsIgnoreCase("hi") || input.equalsIgnoreCase("hello")) {
			answer="Hello! What can I do for you?";
			//System.out.println(answer);	
		}*/		
				   			 
				Random rndm = new Random();	
				AnswerDaoImpl answerDaoImpl=new AnswerDaoImpl();
				List<Answer> list=null;
				
				while(stopLoop) {
								scan=new Scanner(System.in);
								System.out.print("Type here-> ");					
								input=scan.nextLine();
								System.out.println(" ");
		    	try {		    		
		    					System.out.println("Tugba is typing.....");
		    					Thread.sleep(1000);	
		    		}catch (InterruptedException e) {
					e.printStackTrace();
			    	} 
					
						try {
									list=new ArrayList<Answer>();				
						
									Contents contents=answerDaoImpl.getAnswerByInput(input);
									//System.out.println(contents);
									list=answerDaoImpl.getfindAnswerByCategoryId(contents);
						
						if(list.size()>0 ) {
								int k = rndm.nextInt(list.size());
						 
								//System.out.println(k);
								answer=list.get(k).getAnswer();
								System.out.println(answer);
		    			
						}
						
						
						else  if ("3".equals(input)) {
							
							System.out.println("Thank you so much.See you next time!");
							Thread.sleep(1200);	
							Logout logout=new Logout();
							logout.displayOptions();
							//Welcome welcome=new Welcome();
							//welcome.displayOptions();
							
							//System.exit(0);
			    	         
						}
						else {
			    	    		System.out.println("Could you please type again?");  		
			    	  
			    	    		
			    	    	}	
						
						
		    	    	
					}catch(Exception e){
						e.getStackTrace();
					}
							
				}
				
				
				return answer;	
		
			}
	
}
		 
		
	
	


