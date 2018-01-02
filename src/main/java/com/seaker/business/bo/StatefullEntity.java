package com.seaker.business.bo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StatefullEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	
	public StatefullEntity()
	{
		// Default cons ...
	}
	
	public StatefullEntity(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
