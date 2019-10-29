package com.json.dao;

import java.util.List;

public class Schools {
	
   
    private List<FacultyDetails> facultyDetails;
    private String districtId;
	public List<FacultyDetails> getFacultyDetails() {
		return facultyDetails;
	}
	public void setFacultyDetails(List<FacultyDetails> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	@Override
	public String toString() {
		return "Schools [facultyDetails=" + facultyDetails + ", districtId=" + districtId + "]";
	}
    
    
	
    
    

}
