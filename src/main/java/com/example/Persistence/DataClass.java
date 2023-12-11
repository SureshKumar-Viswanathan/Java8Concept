package com.example.Persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.Pojo.Airways;
import com.example.Pojo.Country;
import com.example.Pojo.Person;
import com.example.Pojo.Trip;
import com.example.Pojo.Trip.ModeofTravel;

@Component
public class DataClass {
	
	private static List<Person> personlist= new ArrayList<Person>();
	private static List<Country> countryList=new ArrayList<Country>();
	private static List<Trip> tripList=new ArrayList<Trip>();
	private static List<Airways> airwaysList=new ArrayList<Airways>();
	
	public static List<Country> getCountryList() {
		return countryList;
	}

	public static void setCountryList(List<Country> countryList) {
		DataClass.countryList = countryList;
	}

	public static List<Trip> getTripList() {
		return tripList;
	}

	public static void setTripList(List<Trip> tripList) {
		DataClass.tripList = tripList;
	}

	public static List<Airways> getAirwaysList() {
		return airwaysList;
	}

	public static void setAirwaysList(List<Airways> airwaysList) {
		DataClass.airwaysList = airwaysList;
	}

	static {
		//Long l= new Long();
	
		Person p1= new Person("sureshKumar", 27, Long.valueOf(7767978820L), 2, true);
		Person p2= new Person("ssgv", 27, Long.valueOf(9810522183L), 1, false);
		Person p3= new Person("yuvaPritha", 24, Long.valueOf(875435003L), 1, false);
		Person p31= new Person("chitra", 42, Long.valueOf(1875435003L), 3, false);
		Person p4= new Person("viswa", 51, Long.valueOf(2875435003L), 5, true);
		Person p34= new Person("vicky", 28, Long.valueOf(3875435003L), 2, true);
		Person p345= new Person("sasi", 30, Long.valueOf(4875435003L), 3, true);
		Person p3456= new Person("maran", 5, Long.valueOf(5875435003L), 0, false);
		Person p345678= new Person("dheeshi", 1, Long.valueOf(6875435003L), 0, false);
		Person p332= new Person("selva", 25, Long.valueOf(1875435003L), 0, false);
		personlist.add(p1);
		personlist.add(p2);
		personlist.add(p3);
		personlist.add(p31);
		personlist.add(p4);
		personlist.add(p34);
		personlist.add(p345);
		personlist.add(p3456);
		personlist.add(p345678);
		personlist.add(p332);
		Map<String, String> ks=Map.of("India", "Singapore");
		Map<String, String> ks1=Map.of("England", "India");
		Map<String, String> ks2=Map.of("England", "Belfast");
		Map<String, String> ks3=Map.of("Belfast", "Isle of man");
		//ks.put("Singapore", "India");
		Airways a1=new Airways(123, "silkair", ks, 123.45f);
		Airways a2=new Airways(1234, "British", ks1, 723.45f);
		Airways a3=new Airways(1235, "ryanAir", ks2, 23.45f);
		Airways a4=new Airways(1236, "EasyJet", ks3, 13f);
		airwaysList.add(a1);
		airwaysList.add(a2);
		airwaysList.add(a3);
		airwaysList.add(a4);
		Country a=new Country(1, "india", "+91", 'I',true,8754094056L,new ArrayList<Airways>() { {
			add(a1);add(a2);
			}});
		Country b=	new Country(2, "Singapore", "+65", 'S',true,95432186L,new ArrayList<Airways>() { {
			add(a1);
			}});
		Country c=	new Country(3, "england", "+44", 'U',true,7767978820L,new ArrayList<Airways>() { {
			add(a3);add(a2);
			}});
		Country d=	new Country(4, "belfast", "+44", 'B',true,9511432186L,new ArrayList<Airways>() { {
			add(a3);add(a4);
			}});
		countryList.add(a);
		countryList.add(b);
		countryList.add(c);
		countryList.add(d);
		Trip t1= new Trip("Singapore", ModeofTravel.AIRWAYS, new ArrayList<Person>() {{add(p31); add(p1);}}, new ArrayList<Airways>() { {
			add(a1);
			}});
		Trip t2= new Trip("India", ModeofTravel.AIRWAYS, new ArrayList<Person>() {{add(p2); add(p1);}}, new ArrayList<Airways>() { {
			add(a1);
			}});
		Trip t3= new Trip("India", ModeofTravel.TRAIN, new ArrayList<Person>() {{add(p3); add(p345678);}},null);
		tripList.add(t3);
		tripList.add(t2);
		tripList.add(t1);
		
	}

	public  List<Person> getPersonlist() {
//		Person p1= new Person("sureshKumar", 27, Long.valueOf(7767978820L), 2, true);
//		Person p2= new Person("ssgv", 27, Long.valueOf(9810522183L), 1, false);
//		Person p3= new Person("yuvaPritha", 24, Long.valueOf(875435003L), 0, false);
//		personlist.add(p1);
//		personlist.add(p2);
//		personlist.add(p3);
		return personlist;
	}

	public  void setPersonlist(List<Person> personlist) {
		this.personlist = personlist;
	}
	
	
	
	

}
