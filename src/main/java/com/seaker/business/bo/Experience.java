/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author Admin
 *
 */
@Entity
public class Experience implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	@Column(name="DESIGNATION")
	private String designation;

	@OneToOne
	private List<Company> companies;
	
	@Embedded
	private List<Duration> duration;

	public String getTitle() {
		return designation;
	}

	public void setTitle(String title) {
		this.designation = title;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public List<Duration> getDuration() {
		return duration;
	}

	public void setDuration(List<Duration> duration) {
		this.duration = duration;
	}

}
