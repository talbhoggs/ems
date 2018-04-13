package com.ibm.ph.amperca.ems.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ibm.ph.amperca.ems.model.Employee;
import com.ibm.ph.amperca.ems.service.EmployeeService;

@Named
@ViewScoped
public class EmployeeUpdateManageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
	
	public EmployeeUpdateManageBean() {
		
	}

	public Employee getEmployee() {

		return this.employee;
	}

	public void onLoad() {
		this.employee = employeeService.getEmployee(id);
	}
	
	public String update() {
		
		employeeService.updateEmployee(employee);
		
		return "employee-list";
	}
	
	public String delete () {
		
		employeeService.deleteEmployee(employee);
		
		return "employee-list";
	}
	
	
	

}
