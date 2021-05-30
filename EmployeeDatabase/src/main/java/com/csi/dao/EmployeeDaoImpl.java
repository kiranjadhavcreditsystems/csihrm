package com.csi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public String selectAllSQL = "select * from employee";

	public String selectSQL = "select * from employee where empfirstname=? ";

	public String InsertSQL = "insert into employee(empid,empfirstname,emplastname,empemailid,emppassword,empdesignation,empcurrentaddress,emppermenentaddress,empmaritalstatus,empbloodgroup,empgender,empqualification,empcontactnumber,empuid,emppancardnumber,empsalary,empjoiningdate,empstatus)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	private Employee employee(ResultSet resultSet, int numRow) throws SQLException {
		return Employee.builder().empId(resultSet.getInt(1)).empFirstName(resultSet.getString(2))
				.empLastName(resultSet.getString(3)).empEmailId(resultSet.getString(4))
				.empPassword(resultSet.getString(5)).empDesignation(resultSet.getString(6))
				.empCurrentAddress(resultSet.getString(7)).empPermenentAddress(resultSet.getString(8))
				.empMaritalStatus(resultSet.getString(9)).empBloodGroup(resultSet.getString(10))
				.empGender(resultSet.getString(11)).empQualification(resultSet.getString(12))
				.empContactNumber(resultSet.getLong(13)).empUID(resultSet.getLong(14))
				.empPANCardNumber(resultSet.getString(15)).empSalary(resultSet.getDouble(16))
				.empJoiningDate(resultSet.getDate(17)).empStatus(resultSet.getBoolean(18)).build();
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub

		return jdbcTemplate.query(selectAllSQL, this::employee);
	}

	@Override
	public void saveEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(InsertSQL, employee.getEmpId(), employee.getEmpFirstName(), employee.getEmpLastName(),
				employee.getEmpEmailId(), employee.getEmpPassword(), employee.getEmpDesignation(),
				employee.getEmpCurrentAddress(), employee.getEmpPermenentAddress(), employee.getEmpMaritalStatus(),
				employee.getEmpBloodGroup(), employee.getEmpGender(), employee.getEmpQualification(),
				employee.getEmpContactNumber(), employee.getEmpUID(), employee.getEmpPANCardNumber(),
				employee.getEmpSalary(), employee.getEmpJoiningDate(), employee.isEmpStatus());

	}

	@Override
	public boolean login(String empEmail, String password) {
		// TODO Auto-generated method stub

		boolean status = false;

		for (Employee emp : jdbcTemplate.query(selectAllSQL, this::employee)) {
			if (emp.getEmpEmailId().equalsIgnoreCase(empEmail) && emp.getEmpPassword().equalsIgnoreCase(password)) {
				status = true;
			}
		}
		return status;
	}

	@Override
	public List<Employee> getEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();
		for (Employee emp : jdbcTemplate.query(selectAllSQL, this::employee)) {
			if (emp.getEmpFirstName().equalsIgnoreCase(employee.getEmpFirstName())
					|| emp.getEmpContactNumber() == (employee.getEmpContactNumber())
					|| emp.getEmpId() == (employee.getEmpId())) {
				empList.add(emp);
			}
		}
		return empList;
	}

}
