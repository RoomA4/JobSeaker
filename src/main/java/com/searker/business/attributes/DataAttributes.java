/**
 * 
 */
package com.searker.business.attributes;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Admin
 *
 */

@Embeddable
public class DataAttributes {
	
	@Column(name="ATTRIBUTES")
	private Map<String,String> attributes = new HashMap<>();

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

}
