package com.seaker.business.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String addressId;
	
	@Column(name="STREET_NUMBERS")
	private String streetNumber;
	
	@Column(name="VILLAGE_NAME")
	private String village;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private double pincode;
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getStreetNu() {
		return streetNumber;
	}
	public void setStreetNu(String streetNu) {
		this.streetNumber = streetNu;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getPincode() {
		return pincode;
	}
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	

}
