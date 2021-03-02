package com.revature.pojo;

import java.util.List;

public class UserDetails {
	
	private String firstName;
	
	private String lastName;
	
	private String nickName;
	
	//private List<String> hobies;
	
	private String email;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String firstName, String lastName, String nickName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		//this.hobies = hobies;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/*public List<String> getHobies() {
		return hobies;
	}

	public void setHobies(List<String> hobies) {
		this.hobies = hobies;
	}*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName +  " email=" + email + "]";
	}
	
	

}
