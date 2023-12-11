package com.example.Pojo;

import java.util.Map;

public class Airways {
	
	private int aid;
	private String airName;
	private Map<String,String> fromTo;
	private float price;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}

	public Airways(int aid, String airName, Map<String, String> fromTo, float price) {
		super();
		this.aid = aid;
		this.airName = airName;
		this.fromTo = fromTo;
		this.price = price;
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
	
	
	

}
