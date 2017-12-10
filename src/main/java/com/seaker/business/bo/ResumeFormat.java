/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.util.List;

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
	
	private Gender gender;
	
	private TechnicalExpertise experties;
	

}
