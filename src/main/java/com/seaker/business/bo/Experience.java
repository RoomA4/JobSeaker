/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

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

	private String title;

	private List<Company> companies;

	private List<Duration> duration;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
