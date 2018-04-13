package com.ibm.ph.amperca.ems.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ibm.ph.amperca.ems.model.Employee;
import com.ibm.ph.amperca.ems.service.EmployeeService;

@Named
@RequestScoped
public class EmployeeListManageBean {
	
    @Inject
    private EmployeeService employeeService;
    
    private List<Employee> employees;
    
    @PostConstruct
    public void initialize() {
    	employees = employeeService.getEmployees();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}
