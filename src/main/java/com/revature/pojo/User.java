package com.revature.pojo;

public class User {
	
	private int userID;
	
	private String userName;
	
	private String passWord;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userID, String userName, String passWord) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	

	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	

}
