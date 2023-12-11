package com.example.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Persistence.DataClass;
import com.example.Pojo.Country;
import com.example.Pojo.OverALL;
import com.example.Pojo.Person;
import com.example.Pojo.Trip;

@Component
public class ServiceLayer {
	
	
	@Autowired
	DataClass d;
	
	private static String sk="sureshKumar";
	
	
	public String returnString() {
		return "sureshKumar";
	}
	public String returnStringStatic() {
		return ServiceLayer.retrunSt();
	}
	
	private static String retrunSt() {
		return sk;
	}
	
	public List<Person> getPeople() {
		return d.getPersonlist();
	}
	
	public Person getParticularPeople(String da) {
		return d.getPersonlist().stream().filter((s)->s.getPersonName().contains(da)).findFirst().orElse(null);
	}
	
	public List<Person> getpeopleAgeMorethan18() {
		return d.getPersonlist().stream().filter(((s)->s.getAge()>18)).collect(Collectors.toList());
	}
	public Map<Boolean,List<Person>> getpeoplegroupbYAbroad() {
		//Map<Boolean,List<Person>> mp=new HashMap<Boolean, List<Person>>();
		//mp.put(true,d.getPersonlist().stream().filter(((s)->s.getAbroad()==true)).collect(Collectors.toList()));
		//return mp;
		
		Map<Boolean,List<Person>> mp=d.getPersonlist().stream().collect(Collectors.groupingBy(Person::getAbroad));
		return mp;	
	}
	
	public OverALL detailsOfaPerson(String Name) {
		Map<String,List<?>> a=new HashMap<String, List<?>>();
		a.put("CountryList",d.getCountryList());
		a.put("TripList",d.getTripList());
		a.put("PersonList",d.getPersonlist());
		a.put("AirwaysList",d.getAirwaysList());
		
		 List<Country> da=(List<Country>) a.get("CountryList");
		 List<Trip> dan=(List<Trip>) a.get("TripList");
		 
		 List<Person> people=(List<Person>) a.get("PersonList");
		 Person namea;
		 OverALL o= new OverALL();
		 people.stream()
		    .filter(p -> p.getPersonName().equalsIgnoreCase(Name)) // Filter based on the condition
		    .findFirst() // Get the first matching person
		    .ifPresent(matchingPerson -> {
		        // If a matching person is found, proceed to set the name in 'o'
		        dan.stream()
		            .filter(trip -> trip.getPeople().stream()
		                .anyMatch(d -> d.getPersonName().equalsIgnoreCase(matchingPerson.getPersonName())))
		            .findFirst() // Assuming this finds a 'trip'
		            .ifPresent(trip -> {
		                // Assuming 'o' is an object and 'setName' is a method to set the name
		                o.setName(matchingPerson.getPersonName()); // Set the name in 'o'
		            });
		    });
		 String foundName = people.stream()
				    .filter(p -> p.getPersonName().equalsIgnoreCase(Name)) // Filter based on the condition
				    .findFirst() // Get the first matching person
				    .flatMap(matchingPerson ->
				        dan.stream()
				            .filter(trip -> trip.getPeople().stream()
				                .anyMatch(d -> d.getPersonName().equalsIgnoreCase(matchingPerson.getPersonName())))
				            .findAny() // Assuming this finds a 'trip'
				            .map(trip -> matchingPerson.getPersonName()) // Map to the name if found
				    )
				    .orElse(null);
		 String foundNames = dan.stream()
.flatMap(mp->mp.getPeople().stream()).filter(p->p.getPersonName().equalsIgnoreCase(Name))
.findAny().map(p->p.getPersonName()).orElse(null);

		return o;
		
	}

}
