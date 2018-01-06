package com.seaker.business.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.seaker.business.constant.EmployerType;
/**
 * @author Admin
 *
 */

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employer extends StateFullEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="EMPLOYER_TYPE")
	private EmployerType employerType;
	
	@Column(name="EMPLOYER_NAME")
	private String name;
	
	@Column(name="EMPLOYER_EMAIL")
	private String emailAddress;
	
	@Column(name="WEBSITE_URL")
	private String webSite;
	
	@Column(name="EMPLOYER_PHONE")
	private String phoneNumber;
	
	@Column(name="COMPANY_STRENGTH")
	private String employeeStrength;
	
	@Column(name="TURNOVER")
	private double turnOver;
	
	@Column(name="NO_OF_YEARS")
	private double noOfYearInBusiness;
	
	
	public EmployerType getEmployerType() {
		return employerType;
	}
	public void setEmployerType(EmployerType employerType) {
		this.employerType = employerType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmployeeStrength() {
		return employeeStrength;
	}
	public void setEmployeeStrength(String employeeStrength) {
		this.employeeStrength = employeeStrength;
	}
	public double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
	public double getNoOfYearInBusiness() {
		return noOfYearInBusiness;
	}
	public void setNoOfYearInBusiness(double noOfYearInBusiness) {
		this.noOfYearInBusiness = noOfYearInBusiness;
	}
	
}
