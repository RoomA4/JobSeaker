/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.List;

import com.seaker.business.bo.Employer.Gender;
import com.seaker.business.constant.TechnicalExpertise;
import com.searker.business.attributes.DataAttributes;

/**
 * @author Admin
 *
 */
public class ResumeFormat implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String summary;
	
	private List<Competencies> coreCompetencies;
	
	private List<Experience> experiences;
	
	private List<Education> education;
	
	private List<Certifications> certifications;
	
	private List<Achievements> achievements;
	
	private List<Language> languages;
	
	private DataAttributes attributes;
	
	private double Compensation;
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

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

	public DataAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(DataAttributes attributes) {
		this.attributes = attributes;
	}

	public double getCompensation() {
		return Compensation;
	}

	public void setCompensation(double compensation) {
		Compensation = compensation;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public TechnicalExpertise getExperties() {
		return experties;
	}

	public void setExperties(TechnicalExpertise experties) {
		this.experties = experties;
	}

	private Gender gender;
	
	private TechnicalExpertise experties;
	

}
