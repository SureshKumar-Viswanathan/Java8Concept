package com.example.Pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.Pojo.Trip.ModeofTravel;

public class OverALL {
	private int aid;
	private String airName;
	private Map<String,String> fromTo;
	private float price;
	private int id;
	private String name;
	private String teleCode;
	private char startLetter;
	private boolean travelled;
	private long phoneNumber;
	private ArrayList<Airways> airwaysTravelled;
	private String personName;
	private int age;
	private Long mobileNumber;
	private Integer noOfTrips;
	private Boolean abroad;
	private String location;
	private  ModeofTravel modeOfTravel;
	private List<Person> people;
	private List<Airways> airways;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAirName() {
		return airName;
	}
	public void setAirName(String airName) {
		this.airName = airName;
	}
	public Map<String, String> getFromTo() {
		return fromTo;
	}
	public void setFromTo(Map<String, String> fromTo) {
		this.fromTo = fromTo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeleCode() {
		return teleCode;
	}
	public void setTeleCode(String teleCode) {
		this.teleCode = teleCode;
	}
	public char getStartLetter() {
		return startLetter;
	}
	public void setStartLetter(char startLetter) {
		this.startLetter = startLetter;
	}
	public boolean isTravelled() {
		return travelled;
	}
	public void setTravelled(boolean travelled) {
		this.travelled = travelled;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ArrayList<Airways> getAirwaysTravelled() {
		return airwaysTravelled;
	}
	public void setAirwaysTravelled(ArrayList<Airways> airwaysTravelled) {
		this.airwaysTravelled = airwaysTravelled;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ModeofTravel getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(ModeofTravel modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public List<Person> getPeople() {
		return people;
	}
	public void setPeople(List<Person> people) {
		this.people = people;
	}
	public List<Airways> getAirways() {
		return airways;
	}
	public void setAirways(List<Airways> airways) {
		this.airways = airways;
	}
	
}
