/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Admin
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String userName;
	private com.seaker.business.constant.Role Role;
	private List<Address> addressList;
	private String emailAddress;
	private Address location;
	private String SocialNetworkSignature;
	private String mobileNumber;
	private String gender;
	private List<Attachment> attachmentList;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public com.seaker.business.constant.Role getRole() {
		return Role;
	}
	public void setRole(com.seaker.business.constant.Role role) {
		Role = role;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
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
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public List<Attachment> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<Attachment> attachmentList) {
		this.attachmentList = attachmentList;
	}

}
