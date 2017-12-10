/**
 * 
 */
package com.searker.business.attributes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Admin
 *
 */
public class DataAttributes {
	
	private Map<String,String> attributes = new HashMap<>();

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

}
