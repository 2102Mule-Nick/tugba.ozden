package com.revature.pojo;

public class User {
	
	private String userID;
	
	private String userName;
	
	private String passWord;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userID, String userName, String passWord) {
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

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
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
