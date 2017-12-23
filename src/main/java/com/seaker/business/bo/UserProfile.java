/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.seaker.business.constant.TechnicalExpertise;
import com.searker.business.attributes.DataAttributes;

/**
 * @author Admin
 *
 */
public class UserProfile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="USER_SUMMARY")
	private String summary;
	
	@Column(name="USER_DETAILS_ID")
	private int userId;	
	
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
	
	@OneToMany
	private List<Language> languages;
	
	@Column(name="ATTRIBUTES")
	private DataAttributes attributes;
	
	@Column(name="COMPENSATION")
	private double Compensation;
	
	//private TechnicalExpertise experties;
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	/*public List<Competencies> getCoreCompetencies() {
		return coreCompetencies;
	}

	public void setCoreCompetencies(List<Competencies> coreCompetencies) {
		this.coreCompetencies = coreCompetencies;
	}*/

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

/*	public TechnicalExpertise getExperties() {
		return experties;
	}

	public void setExperties(TechnicalExpertise experties) {
		this.experties = experties;
	}	
*/	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
