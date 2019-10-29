package com.json.dao;

import java.util.List;

public class SchoolAddress {
	private String address;
	private String zip;
	private String medianHouseValue;
	private String city;
	private Schools school;
	private int addressCount;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getMedianHouseValue() {
		return medianHouseValue;
	}
	public void setMedianHouseValue(String medianHouseValue) {
		this.medianHouseValue = medianHouseValue;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Schools getSchool() {
		return school;
	}
	public void setSchool(Schools school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "SchoolAddress [address=" + address + ", zip=" + zip + ", medianHouseValue=" + medianHouseValue
				+ ", city=" + city + ", school=" + school.toString() + "]";
	}
	public int getAddressCount() {
		return addressCount;
	}
	public void setAddressCount(int addressCount) {
		this.addressCount = addressCount;
	}
	
	
	

}
