/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * @author Admin
 *
 */
@Table(name = "USER_DETAILS")
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
	
	
	
	@EmbeddedId
	private StateFullEntity id;
	
	public User() {
		this.id = new StateFullEntity(UUID.randomUUID().toString());
		}
	
	public User(String userId) {
		this.id = new StateFullEntity(userId);
		}
	

	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_ROLE")
	private com.seaker.business.constant.Role role;

	@OneToMany(mappedBy="id" ,cascade = CascadeType.ALL)
	private List<Address> addressList = new ArrayList<>();

	@Column(name = "USER_EMAIL")
	private String emailAddress;
	
	
	@OneToMany (mappedBy = "user", cascade = CascadeType.ALL)
	@NotFound(action=NotFoundAction.IGNORE)
	private List<UserProfile> profiles = new ArrayList<>();

	@Column(name = "USER_SNS")
	private String SocialNetworkSignature;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "GENDER")
	private Gender gender;
	
	
	@OneToMany(mappedBy="id" , cascade= CascadeType.ALL)
	@NotFound(action=NotFoundAction.IGNORE)
	private List<Attachment> attachmentList = new ArrayList<>();

	@Column(name = "REGISTRATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfRegistration;



	public StateFullEntity getId() {
		return id;
	}

	public void setId(StateFullEntity id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public com.seaker.business.constant.Role getRole() {
		return role;
	}

	public void setRole(com.seaker.business.constant.Role role) {
		this.role = role;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public List<UserProfile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<UserProfile> profiles) {
		this.profiles = profiles;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Attachment> getAttachmentList() {
		return attachmentList;
	}

	public void setAttachmentList(List<Attachment> attachmentList) {
		this.attachmentList = attachmentList;
	}
	
	

}
