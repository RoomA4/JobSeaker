package com.seaker.business.rest;

import java.util.List;

import com.seaker.business.bo.Employer;

public interface EmployeeService {
	public Employer getEmployerById(String employerId);
	public List<Employer> getAllEmployer();
	public void registerEmployee();

}
