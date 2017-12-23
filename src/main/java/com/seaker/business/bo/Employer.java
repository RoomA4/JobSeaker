package com.seaker.business.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.seaker.business.constant.EmployerType;
/**
 * @author Admin
 *
 */

@Entity
@Table(name="EMPLOYER")
public class Employer implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String employerId;
	
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
	
	/*@OneToMany
	private List<Address> branchLocaltion = new ArrayList<>();
	*/
	@Column(name="COMPANY_STRENGTH")
	private String employeeStrength;
	
	@Column(name="TURNOVER")
	private double turnOver;
	
	@Column(name="NO_OF_YEARS")
	private double noOfYearInBusiness;
	/*
	@OneToMany(mappedBy="attachementId")
	private List<Attachment> attachments;
	*/
	public String getEmployerId() {
		return employerId;
	}
	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}
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
	/*public List<Attachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}*/
	/*public List<Address> getBranchLocaltion() {
		return branchLocaltion;
	}
	public void setBranchLocaltion(List<Address> branchLocaltion) {
		this.branchLocaltion = branchLocaltion;
	}*/
	
}
