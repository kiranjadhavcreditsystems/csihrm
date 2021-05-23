package com.csi.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private int empId;
	private String empFirstName;
	private String empLastName;
	private String empEmailId;
	private String empPassword;
	private String empDesignation;
	private String empCurrentAddress;
	private String empPermenentAddress;
	private String empMaritalStatus;
	private String empBloodGroup;
	private String empGender;
	private String empQualification;
	private long empContactNumber;
	private long empUID;
	private String empPANCardNumber;
	private double empSalary;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date empJoiningDate;
	private boolean empStatus;

}
