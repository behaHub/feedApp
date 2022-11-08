package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"AuthenticationUser\"")

public class AuthenticationUser {

	
	@Column(name = "\"userPassword\"")
	private String userPassword;
	
	@Column(name = "\"phoneNumber\"")
	private String phoneNumber;
	
	@Column(name = "\"securityQuestion1\"")
	private String securityQuesion1;
	
	@Column(name = "\"securityQuestion2\"")
	private String securityQuestion2;
	
	@Column(name = "\"securityQuestion3\"")
	private String securityQuesion3;
	
	@Column(name = "\"securityAnswer1\"")
	private String securityAnswer1;
	
	@Column(name = "\"securityAnswer2\"")
	private String securityAnswer2;
	
	@Column(name = "\"securityAnswer3\"")
	private String securityAnswer3;
	
	@Id
	@Column(name = "\"usernameKey\"")
	private String usernameKey;
	
		
	public AuthenticationUser() {
		super();
	}


	public AuthenticationUser(String userPassword, String phoneNumber, String securityQuesion1,
			String securityQuestion2, String securityQuesion3, String securityAnswer1, String securityAnswer2,
			String securityAnswer3, String usernameKey) {
		super();
		this.userPassword = userPassword;
		this.phoneNumber = phoneNumber;
		this.securityQuesion1 = securityQuesion1;
		this.securityQuestion2 = securityQuestion2;
		this.securityQuesion3 = securityQuesion3;
		this.securityAnswer1 = securityAnswer1;
		this.securityAnswer2 = securityAnswer2;
		this.securityAnswer3 = securityAnswer3;
		this.usernameKey = usernameKey;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getSecurityQuesion1() {
		return securityQuesion1;
	}


	public void setSecurityQuesion1(String securityQuesion1) {
		this.securityQuesion1 = securityQuesion1;
	}


	public String getSecurityQuestion2() {
		return securityQuestion2;
	}


	public void setSecurityQuestion2(String securityQuestion2) {
		this.securityQuestion2 = securityQuestion2;
	}


	public String getSecurityQuesion3() {
		return securityQuesion3;
	}


	public void setSecurityQuesion3(String securityQuesion3) {
		this.securityQuesion3 = securityQuesion3;
	}


	public String getSecurityAnswer1() {
		return securityAnswer1;
	}


	public void setSecurityAnswer1(String securityAnswer1) {
		this.securityAnswer1 = securityAnswer1;
	}


	public String getSecurityAnswer2() {
		return securityAnswer2;
	}


	public void setSecurityAnswer2(String securityAnswer2) {
		this.securityAnswer2 = securityAnswer2;
	}


	public String getSecurityAnswer3() {
		return securityAnswer3;
	}


	public void setSecurityAnswer3(String securityAnswer3) {
		this.securityAnswer3 = securityAnswer3;
	}


	public String getUsernameKey() {
		return usernameKey;
	}


	public void setUsernameKey(String usernameKey) {
		this.usernameKey = usernameKey;
	}

}
