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

/**
 * @author Admin
 *
 */
@Table(name="ACHIEVEMENTS")
@Entity
public class Achievements implements Serializable {

	/**
	 * Achievents 
	 */
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ACHIEVEMENT_ID")
	private String achievementId;
	
	@ManyToOne
	@JoinColumn(name="PROFILE_ID")
	private UserProfile userProfile;
	
	@Column(name="ACHIEVEMENT_NAME")
	private String achievementName;
	
	@Column(name="DESCRIPTION")
	private String description;

	public String getAchievementName() {
		return achievementName;
	}

	public void setAchievementName(String achievementName) {
		this.achievementName = achievementName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public String getAchievementId() {
		return achievementId;
	}

	public void setAchievementId(String achievementId) {
		this.achievementId = achievementId;
	}
}
