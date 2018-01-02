/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Admin
 *
 */
@Table(name = "USER_BASIC_DETAILS")
@Entity
public class User implements Serializable {

	/**
	 * User Basic profile object.
	 */
	public enum Gender{
		MALE(1),FEMALE(2);
		
		private int code;
		
		Gender(int code){
			this.code = code;
		}
		
		public Gender getGender(int code) {
			return Arrays.stream(Gender.values()).filter(e->e.code==code).findFirst().get();
		}
	}
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String userId;

	@Column(name = "USER_NAME")
	private String userName;
	
	/*@Column(name="USER_TYPE")
	private UserType userType;*/

	@Column(name = "USER_ROLE")
	private com.seaker.business.constant.Role role;

	/*@OneToMany
	private List<Address> addressList;*/

	@Column(name = "USER_EMAIL")
	private String emailAddress;
	
	/*
	@OneToMany
	@NotFound(action=NotFoundAction.IGNORE)
	private List<UserProfile> profiles = new ArrayList<>();
*/
	// todo -- Need to check the feasibility of using this --already having address
	// field
	/*@OneToOne
	private Address location;*/

	@Column(name = "USER_SNS")
	private String SocialNetworkSignature;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "GENDER")
	private Gender gender;
	
	/*
	@OneToMany
	private List<Attachment> attachmentList;
*/
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

	/*public com.seaker.business.constant.Role getRole() {
		return role;
	}

	public void setRole(com.seaker.business.constant.Role role) {
		this.role = role;
	}*/
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

	public String getGender(String code) {
		return Gender.valueOf(code).toString();
	}

	public void setGender(String gender) {
		this.gender = Gender.valueOf(gender);
	}
	
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	
/*	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}*/

	public com.seaker.business.constant.Role getRole() {
		return role;
	}

	public void setRole(com.seaker.business.constant.Role role) {
		this.role = role;
	}

}
