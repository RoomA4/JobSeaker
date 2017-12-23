/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Table(name="ACHIEVEMENTS")
@Entity
public class Achievements implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="ACHIEVEMENT_NAME")
	private String achievementName;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Embedded
	private Duration duration;

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

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

}
