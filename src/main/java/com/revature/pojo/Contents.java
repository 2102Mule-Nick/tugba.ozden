package com.revature.pojo;

import java.util.List;
import java.util.Scanner;

public class Contents {
	private int id;
	private String userInput;
	private Answer machineAnswer;	
	private int categoryId;	
	private int answersId;
	
	
	public Contents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contents(String userInput, Answer machineAnswer, int categoryId, int answersId) {
		super();
		this.userInput = userInput;
		this.machineAnswer = machineAnswer;
		this.categoryId = categoryId;
		this.answersId = answersId;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getUserInput() {
		return userInput;
	}




	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}




	public Answer getMachineAnswer() {
		return machineAnswer;
	}




	public void setMachineAnswer(Answer machineAnswer) {
		this.machineAnswer = machineAnswer;
	}




	public int getCategoryId() {
		return categoryId;
	}




	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}




	public int getAnswersId() {
		return answersId;
	}




	public void setAnswersId(int answersId) {
		this.answersId = answersId;
	}
	
	



	
	
	
	
	

}
