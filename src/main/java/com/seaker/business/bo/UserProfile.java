/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Table(name="USER_PROFILE")
@Entity
public class UserProfile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String profileId;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="id")
	private User user;
	
	@Column(name="USER_SUMMARY")
	private String summary;
	
	public String getUserProfileId() {
		return profileId;
	}

	public void setUserProfileId(String userProfileId) {
		this.profileId = userProfileId;
	}
	
	@OneToMany(mappedBy="userProfile",cascade=CascadeType.ALL)
	private List<Experience> experiences = new ArrayList<>();
	
	@OneToMany(mappedBy="userProfile",cascade=CascadeType.ALL)
	private List<Education> education  = new ArrayList<>();
	
	@OneToMany(mappedBy="userProfile",cascade=CascadeType.ALL)
	private List<Certifications> certifications  = new ArrayList<>();
	
	@OneToMany(mappedBy="userProfile",cascade=CascadeType.ALL)
	private List<Achievements> achievements  = new ArrayList<>();
	
	@Column(name="COMPENSATION")
	private double Compensation;
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public double getCompensation() {
		return Compensation;
	}

	public void setCompensation(double compensation) {
		Compensation = compensation;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Certifications> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certifications> certifications) {
		this.certifications = certifications;
	}

	public List<Achievements> getAchievements() {
		return achievements;
	}

	public void setAchievements(List<Achievements> achievements) {
		this.achievements = achievements;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	



}
