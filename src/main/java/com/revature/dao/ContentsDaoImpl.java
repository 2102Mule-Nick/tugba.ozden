package com.revature.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.revature.pojo.Contents;
import com.revature.pojo.User;

public class ContentsDaoImpl {
	
	
	
	final static List<String> ANSWER_LIST = new ArrayList<>();
	
	
	//public static List<Contents> getContentsList() {
		
		//return ANSWER_LIST;
	//}
	//public static void createContents(Contents contents) {	
		//ANSWER_LIST.add(contents);
		
	//}
	/*
*/
	
	public  Contents getAnswerByInput(Contents contents) {
				//contents=new Contents();
	
		if(contents.getUserInput().equalsIgnoreCase("hi") || contents.getUserInput().equalsIgnoreCase("hello")) {
			contents.setMachineAnswer("Hello! What can I do for you?");
			//System.out.println("");
			ANSWER_LIST.add(contents.getMachineAnswer());
			
			System.out.println(contents);
		}
		
		return contents ;
	}
	
	
	
	

}
