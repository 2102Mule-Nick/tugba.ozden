package com.revature.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.revature.pojo.Contents;
import com.revature.pojo.User;
import com.revature.ui.Logout;
import com.revature.ui.Welcome;

public class ContentsDaoImpl {	
	
	final static List<String> INPUT_LIST = new ArrayList<>();
	
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
	//}
	//public static void createContents() {	
		
		
	//}
	
	public String getAnswerByInput(String input) {	
		String answer="...";
		boolean stopLoop=true;
		Scanner scan=new Scanner(System.in);
		
		GREETING.add("hello");
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
		
		EDUCATION.add("did you graduate from College?");
		EDUCATION.add("do you study right now?");
		EDUCATION.add("where do you study?");
		
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
				while(stopLoop) {
					
					System.out.print("User  :");
					input=scan.nextLine();
		    	try {		    		
		    		System.out.println("Machine is typing.....");
		    		Thread.sleep(1000);	
		    	}catch (InterruptedException e) {
					e.printStackTrace();
			    	} 
					int i=-1;
					try {
					while(stopLoop) {//System.out.println(GREETING.get(0));
						i++;			    	 	
						
						if(i < GREETING.size() && input.toLowerCase().contains((GREETING.get(i).toLowerCase()))) {
			    		    	
			    				int k = rndm.nextInt(GREET_ANSWR.size());
			    				//System.out.println(k);
				    			answer="Machine  : " +GREET_ANSWR.get(k) ;
				    			System.out.println(answer);
				    			break;
			    	    	} 
			    	 	  	 	
						else if(i < WELCOME.size() && input.toLowerCase().contains(WELCOME.get(i))||input.toLowerCase().contains(WEL_ANSWR.get(i))) {		    	    
			    				int k = rndm.nextInt(WEL_ANSWR.size());
			    				//System.out.println(k);
				    			answer="Machine : Himm... " + WEL_ANSWR.get(k) ;
				    			System.out.println(answer);
				    			break;
			    	    	}
						else if (i < FIRST_TALK.size() && input.toLowerCase().contains(FIRST_TALK.get(i)) ||input.toLowerCase().contains(FRST_TLK_ANSWR.get(i))) {
			    				 int k = rndm.nextInt(FRST_TLK_ANSWR.size());
			    				//System.out.println(k);
				    			answer= "Machine : Good! "+FRST_TLK_ANSWR.get(k);
				    			System.out.println(answer);
				    			break;
			    	    	}
						else if(i < EDUCATION.size() && input.toLowerCase().contains(EDUCATION.get(i))||input.toLowerCase().contains(EDCTN_ANSWR.get(i))){
				    				int k = rndm.nextInt(EDCTN_ANSWR.size());				    				
					    			answer= "Machine :Great!"+ EDCTN_ANSWR.get(k) ;	
					    			System.out.println("Himm..."+ answer);
					    			break;
			    	    	}
						else if(i < JOB.size() && input.toLowerCase().contains(JOB.get(i))||input.toLowerCase().contains(JOB_ANSWR.get(i))){
			    				int k = rndm.nextInt(JOB_ANSWR.size());				    				
				    			answer= "Machine :Great!"+ JOB_ANSWR.get(k) ;	
				    			System.out.println("Well... \n"+ answer);
				    			break;
		    	    	}						
						else  if(i < HOW.size() && input.toLowerCase().contains(HOW.get(i))||input.toLowerCase().contains(HOW_ANSWR.get(i))){
		    				int k = rndm.nextInt(HOW_ANSWR.size());				    				
			    			answer= "Machine :Great!"+ HOW_ANSWR.get(k) ;	
			    			System.out.println(" "+ answer);
			    			break;
		    	    		}
						
						else if (input.equals("3")) {							
							 Logout log=new Logout();
							 log.displayOptions();
			    	         Welcome w=new Welcome();
			    	         w.displayOptions();
						}
						else {
			    	    		System.out.println("I don't understand.");
			    	    		//System.exit(0);
			    	  
			    	    		
			    	    	}	    	 		
		    	    	
					}}catch(Exception e){
						e.getStackTrace();
					}
							
				}return answer;	
		
}
	
}
		 
		
	
	


