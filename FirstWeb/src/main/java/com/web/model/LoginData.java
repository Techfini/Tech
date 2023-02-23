package com.web.model;

public class LoginData {

	private String userName;
	private String email;
	
	
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginData(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
	
	
	
}
