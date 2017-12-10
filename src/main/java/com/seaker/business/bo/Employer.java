package com.seaker.business.bo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.seaker.business.constant.EmployerType;
/**
 * @author Admin
 *
 */
public class Employer implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Gender{
		MALE(1),FEMALE(2);
		
		private int code;
		
		Gender(int code){
			this.code = code;
		}
		
		public Gender getGender(int code) {
			return Arrays.stream(Gender.values()).filter(e->e.code==code).findFirst().get();
		}
	}
	@Id
	private String employerId;
	@Column
	private EmployerType employerType;
	@Column
	private String name;
	@Column
	private String emailAddress;
	@Column
	private String webSite;
	@Column
	private String phoneNumber;
	@OneToOne
	private Address branchLocaltion;
	@Column
	private String employeeStrength;
	@Column
	private double turnOver;
	@Column
	private double noOfYearInBusiness;
	@OneToMany(mappedBy="attachementId")
	private List<Attachment> attachments;
	
	private Gender gender;
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
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
	public Address getBranchLocaltion() {
		return branchLocaltion;
	}
	public void setBranchLocaltion(Address branchLocaltion) {
		this.branchLocaltion = branchLocaltion;
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
	
}
