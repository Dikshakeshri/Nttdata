package com.nttdata.Model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message="required")
	private int userId;
	@NotEmpty(message="User name should be Empty")
	private String userName;
	@NotEmpty(message="Please enter valid password")
	@Size(min = 6, max = 12, message = "Your password must have 6 and 12 characters")
	private String password;
	@NotEmpty(message="Provide phone number")
	private long contact;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty(message="Provide address")
	private String Address;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
