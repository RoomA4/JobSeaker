package com.seaker.business.dto;

import java.util.Date;

public class UserDetailRequest {
	
	private String userName;
	
	private String role;
	
	private String emailAddress;
	
	private String SocialNetworkSignature;
	
	private String mobileNumber;
	
	private String gender;
	
	private Date dateOfRegistration;
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSocialNetworkSignature() {
		return SocialNetworkSignature;
	}

	public void setSocialNetworkSignature(String socialNetworkSignature) {
		SocialNetworkSignature = socialNetworkSignature;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
