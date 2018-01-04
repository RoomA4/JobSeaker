/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Admin
 *
 */
@Table(name="PROFESSIONAL_EXPERIENCE")
@Entity
public class Experience implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PRF_EXP_ID")
	private String exprienceId;

	@ManyToOne
	@JoinColumn(name="profileId", nullable=false)
	private UserProfile userProfile;

	@Column(name="DESIGNATION")
	private String designation;

	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Embedded
	@Temporal(TemporalType.DATE)
	private Duration duration;
	
	public String getExperienceId() {
		return exprienceId;
	}

	public void setExperienceId(String experienceId) {
		exprienceId = experienceId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public String getExprienceId() {
		return exprienceId;
	}

	public void setExprienceId(String exprienceId) {
		this.exprienceId = exprienceId;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	

}
