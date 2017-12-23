/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.List;

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
	private String ExperienceId;

	@ManyToOne
	@JoinColumn(name="PROFILE_ID")
	private UserProfile userProfile;

	@Column(name="DESIGNATION")
	private String designation;

	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Embedded
	@Temporal(TemporalType.DATE)
	private Duration duration;
	
	public String getExperienceId() {
		return ExperienceId;
	}

	public void setExperienceId(String experienceId) {
		ExperienceId = experienceId;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
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

}
