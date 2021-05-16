package com.csi.model;

	import java.util.Date;

	import lombok.Builder;
	import lombok.Data;

	@Builder
	@Data
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
		private Date empJoiningDate;
		private boolean empStatus;
		
		
		
		public Employee()    //To use builder design pattern requried constructor
		{
			
		}
		
		
		public Employee(int empId, String empFirstName, String empLastName, String empEmailId, String empPassword,
				String empDesignation, String empCurrentAddress, String empPermenentAddress, String empMaritalStatus,
				String empBloodGroup, String empGender, String empQualification, long empContactNumber, long empUID,
				String empPANCardNumber, double empSalary, Date empJoiningDate, boolean empStatus) {
			super();
			this.empId = empId;
			this.empFirstName = empFirstName;
			this.empLastName = empLastName;
			this.empEmailId = empEmailId;
			this.empPassword = empPassword;
			this.empDesignation = empDesignation;
			this.empCurrentAddress = empCurrentAddress;
			this.empPermenentAddress = empPermenentAddress;
			this.empMaritalStatus = empMaritalStatus;
			this.empBloodGroup = empBloodGroup;
			this.empGender = empGender;
			this.empQualification = empQualification;
			this.empContactNumber = empContactNumber;
			this.empUID = empUID;
			this.empPANCardNumber = empPANCardNumber;
			this.empSalary = empSalary;
			this.empJoiningDate = empJoiningDate;
			this.empStatus = empStatus;
		}

		
	}


