/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Table(name="JOBS")
@Entity
public class Jobs implements Serializable {

	/**
	 * Job posting details.
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="JOB_ID")
	private String id;
	
	@Column(name="JOB_TITLE")
	private String title;
	
	@Column(name="EXPERIENCE")
	private String experience;
	
	@Column(name="MIN_SALARY")
	private short minSalary;
	
	@Column(name="MAX_SALARY")
	private short maxSalary;
	
	@Column(name="JOB_DESCRIPTION")
	private String description;
	
	@Column(name="AVAILABLE")
	private boolean available;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public short getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(short minSalary) {
		this.minSalary = minSalary;
	}

	public short getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(short maxSalary) {
		this.maxSalary = maxSalary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	//Last point "How would jobseaker apply"

}
