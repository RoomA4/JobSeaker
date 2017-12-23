/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Table(name="CERTIFICATIONS")
@Entity
public class Certifications implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String certificationId;

	@Column(name="CERTIFICATION")
	private String certificateName;
	
	@Column(name="CERTIFICATION_AUTHORITY")
	private String certificationAuthority;
	
	private Duration durations;

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificationAuthority() {
		return certificationAuthority;
	}

	public void setCertificationAuthority(String certificationAuthority) {
		this.certificationAuthority = certificationAuthority;
	}

	public Duration getDurations() {
		return durations;
	}

	public void setDurations(Duration durations) {
		this.durations = durations;
	}
}
