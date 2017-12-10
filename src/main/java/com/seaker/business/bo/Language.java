/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;

import com.seaker.business.constant.Proficiency;

/**
 * @author Admin
 *
 */
public class Language implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int languageId;

	private String languageName;

	private Proficiency proficiency;

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}

}
