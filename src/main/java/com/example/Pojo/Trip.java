package com.example.Pojo;

import java.util.*;

public class Trip {
	
	public enum ModeofTravel {
		CAR,
		BUS,
		TRAIN,
		AIRWAYS,
		FERRY
	}
	
	private String location;
	private  ModeofTravel modeOfTravel;
	private List<Person> people;
	private List<Airways> airways;
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
	public Trip(String location, ModeofTravel modeOfTravel, List<Person> people, List<Airways> airways) {
		super();
		this.location = location;
		this.modeOfTravel = modeOfTravel;
		this.people = people;
		this.airways = airways;
	}
	
	

}
