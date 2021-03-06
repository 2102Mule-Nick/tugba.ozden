package com.revature.pojo;

import java.util.List;
import java.util.Scanner;

public class Contents {
	//Scanner scan= new Scanner(System.in);
	private String userInput;
	private String machineAnswer;	
	private List<String> inputs;	
	private List<String> answers;
	
	public String getContentsCategory() {
		return contentsCategory;
	}


	public void setContentsCategory(String contentsCategory) {
		this.contentsCategory = contentsCategory;
	}

	private String contentsCategory;

	public Contents() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Contents(String userInput, String machineAnswer) {
		super();
		this.userInput = userInput;
		this.machineAnswer = machineAnswer;
	}

	public Contents(List<String> inputs, List<String> answers) {
		super();
		this.inputs = inputs;
		this.answers = answers;
		}
	
	

	public Contents(List<String> answers, String contentsCategory) {
		super();
		this.answers = answers;
		this.contentsCategory = contentsCategory;
	}


	public Contents(String userInput) {
		super();
		this.userInput = userInput;
		//this.contentsCategory = contentsCategory;
	}


	public String getUserInput() {
		return userInput;
	}


	public void setUserInput(String userInput) {
		//userInput.nextLine();
		this.userInput = userInput;
	}


	public String getMachineAnswer() {
		return machineAnswer;
	}


	public void setMachineAnswer(String machineAnswer) {
		this.machineAnswer = machineAnswer;
	}


	public List<String> getInputs() {
		return inputs;
	}

	public void setInputs(List<String> inputs) {
		this.inputs = inputs;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	
	
	

}
