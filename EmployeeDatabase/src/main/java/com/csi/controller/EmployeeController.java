package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeServiceImpl;
	
	@GetMapping("/employee")
	public List<Employee> getAllData(){
		return employeeServiceImpl.getAllData();
	}
	
	@PostMapping("/employee")
	public String saveEmployeeData(@RequestBody Employee employee){
		employeeServiceImpl.saveEmployeeData(employee);
		return "Save Data Successfully";
	}
	@GetMapping("/login/{empEmail}/{empPassword}")
	boolean isLoginValid(@PathVariable String empEmail, @PathVariable String empPassword)
	{
		return employeeServiceImpl.login(empEmail, empPassword);
	}
	
	@PostMapping("/hrmdirectory")
	public List<Employee> getEmployeeData(@RequestBody Employee employee){
		return employeeServiceImpl.getEmployeeData(employee);
		
	}
	
	

}
