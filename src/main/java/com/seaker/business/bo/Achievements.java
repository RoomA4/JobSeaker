/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;

/**
 * @author Admin
 *
 */
public class Achievements implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String achievementName;
	
	private String description;
	
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
