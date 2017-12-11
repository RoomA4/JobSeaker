/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Admin
 *
 */
@Table(name = "USER")
@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_ROLE")
	private com.seaker.business.constant.Role Role;

	@OneToMany
	private List<Address> addressList;

	@Column(name = "USER_EMAIL")
	private String emailAddress;

	// todo -- Need to check the feasibility of using this --already having address
	// field
	@OneToOne
	private Address location;

	@Column(name = "USER_SNS")
	private String SocialNetworkSignature;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "GENDER")
	private String gender;

	@OneToMany
	private List<Attachment> attachmentList;

	@Column(name = "REGISTRATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfRegistration;

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

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

}
