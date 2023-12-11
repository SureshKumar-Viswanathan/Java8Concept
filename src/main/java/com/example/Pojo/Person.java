package com.example.Pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


public class Person {
	
	private String personName;
	private int age;
	private Long mobileNumber;
	private Integer noOfTrips;
	private Boolean abroad;
	
	
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", mobileNumber=" + mobileNumber + ", noOfTrips="
				+ noOfTrips + ", abroad=" + abroad + "]";
	}
	public Person(String personName, int age, Long mobileNumber, Integer noOfTrips, Boolean abroad) {
		super();
		this.personName = personName;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.noOfTrips = noOfTrips;
		this.abroad = abroad;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getNoOfTrips() {
		return noOfTrips;
	}
	public void setNoOfTrips(Integer noOfTrips) {
		this.noOfTrips = noOfTrips;
	}
	public Boolean getAbroad() {
		return abroad;
	}
	public void setAbroad(Boolean abroad) {
		this.abroad = abroad;
	}
	
	

}
