package com.seaker.business.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.seaker.business.constant.EmployerType;
/**
 * @author Admin
 *
 */

@Entity
@Table
public class Employer implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@EmbeddedId
	private StatefullEntity id;
	
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
	
	@OneToMany(mappedBy="userid", cascade = CascadeType.ALL)
	@NotFound(action=NotFoundAction.IGNORE)
	private List<Address> branchLocaltion = new ArrayList<>();
	
	@Column(name="COMPANY_STRENGTH")
	private String employeeStrength;
	
	@Column(name="TURNOVER")
	private double turnOver;
	
	@Column(name="NO_OF_YEARS")
	private double noOfYearInBusiness;
	
	@OneToMany(mappedBy="userId",cascade = CascadeType.ALL)
	private List<Attachment> attachments = new ArrayList<>();
	
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
	public List<Attachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	public List<Address> getBranchLocaltion() {
		return branchLocaltion;
	}
	public void setBranchLocaltion(List<Address> branchLocaltion) {
		this.branchLocaltion = branchLocaltion;
	}
	public StatefullEntity getId() {
		return id;
	}
	public void setId(StatefullEntity id) {
		this.id = id;
	}
	
	
	
}
