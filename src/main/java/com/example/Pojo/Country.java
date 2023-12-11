package com.example.Pojo;

import java.util.ArrayList;

public class Country {
	
	private int id;
	private String name;
	private String teleCode;
	private char startLetter;
	private boolean travelled;
	private long phoneNumber;
	private ArrayList<Airways> airwaysTravelled;
	
	
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", teleCode=" + teleCode + ", startLetter=" + startLetter
				+ ", travelled=" + travelled + ", phoneNumber=" + phoneNumber + ", airwaysTravelled=" + airwaysTravelled
				+ "]";
	}
	public Country(int id, String name, String teleCode, char startLetter, boolean travelled, long phoneNumber,
			ArrayList<Airways> airwaysTravelled) {
		super();
		this.id = id;
		this.name = name;
		this.teleCode = teleCode;
		this.startLetter = startLetter;
		this.travelled = travelled;
		this.phoneNumber = phoneNumber;
		this.airwaysTravelled = airwaysTravelled;
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
	
	
}
