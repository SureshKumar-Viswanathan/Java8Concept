package com.example.JavaConcepts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Persistence.DataClass;
import com.example.Pojo.Country;
import com.example.Pojo.Person;
import com.example.Pojo.Trip;

public class TestClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodTest();
	}
	private static void methodTest() {
		
		DataClass d=new DataClass();
		Map<String,List<?>> a=new HashMap<String, List<?>>();
		a.put("CountryList",d.getCountryList());
		a.put("TripList",d.getTripList());
		a.put("PersonList",d.getPersonlist());
		a.put("AirwaysList",d.getAirwaysList());
		
		 List<Country> da=(List<Country>) a.get("CountryList");
		 List<Trip> dan=(List<Trip>) a.get("TripList");
		 
		 List<Person> people=(List<Person>) a.get("PersonList");
		 Long foundNames = dan.stream()
.flatMap(mp->mp.getPeople().stream()).filter(p->p.getPersonName().equalsIgnoreCase("ssgv"))
.findAny().map(p->p.getMobileNumber()).orElse(null);
		System.out.println(foundNames);
	}

}
