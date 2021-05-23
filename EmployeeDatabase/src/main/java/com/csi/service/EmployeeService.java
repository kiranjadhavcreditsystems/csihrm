package com.csi.service;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllData();

	public void saveEmployeeData(Employee employee);
	
	public boolean login(String empEmail, String password);
}
