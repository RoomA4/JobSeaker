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

@Table(name="EDUCATION")
@Entity
public class Education implements Serializable {
	
	
	@Id
	@Column(name="EDU_ID")
	private String educationId;
	
	@ManyToOne
	@JoinColumn(name="PROFILE_ID")
	private UserProfile userProfile;
	
	@Column(name="DEGREE_NAME")
	private String name;

	@Embedded
	@Temporal(TemporalType.DATE)
	private Duration duration;
	
	private static final long serialVersionUID = 1L;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public String getEducationId() {
		return educationId;
	}

	public void setEducationId(String educationId) {
		this.educationId = educationId;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
