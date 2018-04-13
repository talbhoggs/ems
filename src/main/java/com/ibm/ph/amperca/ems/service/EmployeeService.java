package com.ibm.ph.amperca.ems.service;

import java.util.List;

import com.ibm.ph.amperca.ems.model.Employee;

public interface EmployeeService {
	
    List<Employee> getEmployees();

    Employee getEmployee(int id);
    
    void addEmployee(Employee employee);
    
    void updateEmployee(Employee employee);
    
    void deleteEmployee(Employee employee);

}
