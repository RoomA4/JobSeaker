/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends StateFullEntity implements Serializable {

	/**
	 * User Basic profile object.
	 */
	public enum Gender{
		MALE("M"),FEMALE("F");
		
		private int code;
		
		private String shortname;
		
		private Gender(String shortname) {
			this.shortname = shortname;
		}
		
		public String getShortname() {
			return shortname;
		}
		
		Gender(int code){
			this.code = code;
		}
		
		public Gender getGender(int code) {
			return Arrays.stream(Gender.values()).filter(e->e.code==code).findFirst().get();
		}
	}
	public enum State {
		 
	    ACTIVE("Active"),
	    INACTIVE("Inactive"),
	    DELETED("Deleted"),
	    LOCKED("Locked");
	     
	    private String state;
	     
	    private State(final String state){
	        this.state = state;
	    }
	     
	    public String getState(){
	        return this.state;
	    }
	 
	    @Override
	    public String toString(){
	        return this.state;
	    }
	 
	    public String getName(){
	        return this.name();
	    }
	}
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="SSO_ID", unique=true, nullable=false)
	private String ssoId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_ROLE")
	private com.seaker.business.constant.Role role;

	@Column(name = "USER_EMAIL")
	private String emailAddress;
	
	@Column(name="STATE", nullable=false)
	private State state;
	
	@OneToMany (mappedBy = "user", cascade = CascadeType.ALL)
	@NotFound(action=NotFoundAction.IGNORE)
	private Set<UserProfile> profiles = new HashSet<>();

	@Column(name = "USER_SNS")
	private String SocialNetworkSignature;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "GENDER")
	private Gender gender;
	
	@Column(name = "REGISTRATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfRegistration;

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
	
	@Enumerated(EnumType.ORDINAL)
	public com.seaker.business.constant.Role getRole() {
		return role;
	}

	public void setRole(com.seaker.business.constant.Role role) {
		this.role = role;
	}

	

	@Enumerated(EnumType.ORDINAL)
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserProfile> getProfiles() {
		return profiles;
	}

	public void setProfiles(Set<UserProfile> profiles) {
		this.profiles = profiles;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result =7 ;
		result = result *31 + ((ssoId == null) ? 0: ssoId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof User)) {
			return false;
		}
		User other =(User)obj;
		if(this.getId() != other.getId()) {
			return false;
		}
		if(ssoId == null) {
			if(other.ssoId !=null) {
				return false;
			}
		}else if(!ssoId.equals(other.ssoId)){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Hello"+userName+" welcome "+ssoId;
	}

	public State getState() {
		return state;
	}

	public void setState(String state) {
		this.state = State.valueOf(state);
	}
}
