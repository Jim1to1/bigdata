package com.bigdata.beans;

/**
 * 用户表
 * @author yangyang
 *
 */
public class User {

	private Integer userId;
	private String userName;
	private String password;
	
	public User() {
		super();
	}

	public User(Integer userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
