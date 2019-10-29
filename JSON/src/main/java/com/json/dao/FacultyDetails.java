package com.json.dao;

public class FacultyDetails {
	
     private String name;
     private String role;
     private String startDate;
     private String schollGrade;
     private String schollName;
     private int facultyCount; 
     private int addressCount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getSchollGrade() {
		return schollGrade;
	}
	public void setSchollGrade(String schollGrade) {
		this.schollGrade = schollGrade;
	}
	public String getSchollName() {
		return schollName;
	}
	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}
	@Override
	public String toString() {
		return "FacultyDetails [name=" + name + ", role=" + role + ", startDate=" + startDate + ", schollGrade="
				+ schollGrade + ", schollName=" + schollName + "]";
	}
	public int getFacultyCount() {
		return facultyCount;
	}
	public void setFacultyCount(int facultyCount) {
		this.facultyCount = facultyCount;
	}
	public int getAddressCount() {
		return addressCount;
	}
	public void setAddressCount(int addressCount) {
		this.addressCount = addressCount;
	}

	
     
     

}
