package com.ibm.ph.amperca.ems.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ibm.ph.amperca.ems.model.Employee;
import com.ibm.ph.amperca.ems.service.EmployeeService;

@Named // same as ManageBean annotation
@RequestScoped
public class EmployeeDetailsManageBean {

	@Inject
	private EmployeeService employeeService;

	private int id;

	private Employee employee;


	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public Employee getEmployee() {
		return this.employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void onLoad()
	{
		this.employee = employeeService.getEmployee(id);
	}
}
