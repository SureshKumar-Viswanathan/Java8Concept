package com.example.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.lang.model.util.Elements.Origin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Persistence.DataClass;
import com.example.Pojo.Person;

import io.micrometer.common.lang.NonNullApi;

@RestController
@RequestMapping("/someApi")
@CrossOrigin(origins = "http://localhostss")
public class ControllerLayer {
	
	
	@Autowired
	ServiceLayer sl;
	
	@Autowired
	@Qualifier("donw")
	Person p;
	
	@Autowired
	DataClass ds;
	
	
	
	@GetMapping("/getALL")
	public Map<String,List<?>> getmethod() {
		Map<String,List<?>> a=new HashMap<String, List<?>>();
		a.put("CountryList",ds.getCountryList());
		a.put("TripList",ds.getTripList());
		a.put("PersonList",ds.getPersonlist());
		a.put("AirwaysList",ds.getAirwaysList());
		
		 return a;
		//return Req;
		
	}
	
	
	@GetMapping("/PersonAbroad")
	public Map<Boolean,List<Person>> getmethodsq() {
		
		 return sl.getpeoplegroupbYAbroad();
		//return Req;
		
	}
	
	
	
	
	//day1
	@GetMapping("/done")
	public Person getmethodq() {
		
		 return p;
		//return Req;
		
	}
	
	@GetMapping("/getPersons")
	public ResponseEntity<List<Person>> getmethods() {
		
		 return ResponseEntity.status(200).body(sl.getPeople());
		//return Req;
		
	}
	
	@GetMapping(value="/getPersonss",produces =("application/xml") )
	public ResponseEntity<List<Person>> getmethodss() {
		
		 return ResponseEntity.status(200).body(sl.getPeople());
		//return Req;
		
	}
	
	@GetMapping(value="/getPersonssa",produces ={"application/xml","text/xml" })
	public Person getmethodssa() {
		
		 return  new Person("sureshKumar", 27, Long.valueOf(7767978820L), 2, true) ;
		//return Req;
		
	}
	
	@RequestMapping(value="/Person",method=RequestMethod.GET ,produces =("application/Json") )
	public ResponseEntity<List<Person>> getmethodsss() {
		
		 return ResponseEntity.status(200).body(sl.getPeople());
		//return Req;
		
	}
	@RequestMapping(value="/Person",method=RequestMethod.POST ,produces =("application/Json") )
	public ResponseEntity<Person> getmethodsssaa(@RequestBody Person p) {
		
		 return ResponseEntity.status(200).body(p);
		//return Req;
		
	}
	@RequestMapping(value="/Person/{id}",method=RequestMethod.DELETE ,produces =("application/Json") )
	public ResponseEntity<Person> getmethodsssa(@PathVariable int id) {
		
		 return ResponseEntity.status(200).body(sl.getPeople().stream().filter((s)->s.getAge()==id).findAny().orElse(new Person("sureshKumar", 27, Long.valueOf(7767978820L), 2, true)));
		//return Req;
		
	}
	
	@RequestMapping(value="/Persons/{id}",method=RequestMethod.DELETE ,produces =("application/Json") )
	public ResponseEntity<String> getmethodsssa(@PathVariable int id,@RequestParam("name") String userName,@RequestHeader("age") int age) {
		
		 return ResponseEntity.status(200).body(userName+String.valueOf(age));
		//return Req;
		
	}
	
	

}
