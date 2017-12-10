/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;

/**
 * @author Admin
 *
 */
public class Certifications implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String certificateName;
	
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
