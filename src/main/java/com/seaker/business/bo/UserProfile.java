/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.seaker.business.constant.TechnicalExpertise;
import com.searker.business.attributes.DataAttributes;

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
	@Column(name="PROFILE_ID")
	private String userProfileId;
	
	@Column(name="USER_SUMMARY")
	private String summary;
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;
	
	public String getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
	}
	
	/*@OneToMany
	private List<Competencies> coreCompetencies;*/
	
	@OneToMany
	private List<Experience> experiences;
	
	@OneToMany
	private List<Education> education;
	
	@OneToMany
	private List<Certifications> certifications;
	
	@OneToMany
	private List<Achievements> achievements;
	
	//@Embedded
	//private DataAttributes attributes ;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name="COMPENSATION")
	private double Compensation;
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	
	//private TechnicalExpertise experties;
	/*
	
	public List<Competencies> getCoreCompetencies() {
		return coreCompetencies;
	}

	public void setCoreCompetencies(List<Competencies> coreCompetencies) {
		this.coreCompetencies = coreCompetencies;
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

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	

	/*

	public TechnicalExpertise getExperties() {
		return experties;
	}

	public void setExperties(TechnicalExpertise experties) {
		this.experties = experties;
	}	
*/	
	/*public DataAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(DataAttributes attributes) {
		this.attributes = attributes;
	}*/
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

	/*public DataAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(DataAttributes attributes) {
		this.attributes = attributes;
	}*/

}
