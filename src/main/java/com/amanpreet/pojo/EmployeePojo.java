package com.amanpreet.pojo;

public class EmployeePojo {
	private String firstName, lastName, department;
	private String[] technologies;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}

}