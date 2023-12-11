package com.example.JavaConcepts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.Persistence.DataClass;
import com.example.Pojo.Person;
import com.example.services.ServiceLayer;

@ExtendWith(SpringExtension.class)
//@ExtendWith(MockitoExtension.class)
public class Junit5Try {

	@Mock
	DataClass d;
//	
	@InjectMocks
	ServiceLayer sl;
	 @BeforeEach
	    public void setup() {
	        MockitoAnnotations.openMocks(this);
	    }
	@Test
	public void testReturn() {
		assertEquals("suresh", sl.returnString());
		
	}
	
	@Test
	public void testgetPeople() {
		when(d.getPersonlist()).thenReturn(null);
		
		assertNull(sl.getPeople());
	}
	
	@Test
	public void testgetPeople2() {
		List<Person> p=new ArrayList<Person>() {{add(new Person("sss", 21, null, null, null));}};
		//System.out.println(p.stream().map(P->P.getPersonName()).count());
		when(d.getPersonlist()).thenReturn(p);
		
		assertNotNull(sl.getPeople());
		assertEquals(p, sl.getPeople());
		//System.out.println(sl.getPeople().stream().map(P->P.getPersonName()).count());
	//	System.out.println(name);
		assertEquals(sl.getPeople().stream().findFirst().map(Person::getPersonName).orElse(null), "sss");
	}
	
	
//	@Test
//	public void testggetParticularPeople() {
//	Person x=new Person("sss", 21, null, null, null);
//		//Person personMock = Mockito.mock(Person.class);
//		String l=Mockito.anyString();
//		//Person personMock = new Person(l, 21, null, null, null);
//		//personMock.setPersonName(Mockito.anyString());
//		List<Person> p=new ArrayList<Person>() {{add(x);}};
//		when(d.getPersonlist()).thenReturn(p);		
//		assertNotNull(sl.getParticularPeople("sss"));
//		assertEquals(x, sl.getParticularPeople("sss"));
//	
//	}
	
	
	@Test
	public void testGetVal() {
		Person x=new Person("sss", 21, null, null, null);
		List<Person> p=new ArrayList<Person>() {{add(x);}};
		//when(d.getPersonlist()).thenReturn(p);
		doReturn(p).when(d).getPersonlist();
		assertNotNull(sl.getParticularPeople("sss"));
		assertEquals(x, sl.getParticularPeople("sss"));		
	}
	
	
	@Test
	public void testMapgetpeoplegroupbYAbroad() {
		Person x=new Person("sss", 21, null, null, true);
		Person xw=new Person("asss", 21, null, null, false);
		List<Person> p=new ArrayList<Person>() {{add(x);add(xw);}};
		doReturn(p).when(d).getPersonlist();
		assertNotNull(sl.getpeoplegroupbYAbroad());
		Map<Boolean,List<Person>> aw=sl.getpeoplegroupbYAbroad();
		assertEquals(2, sl.getpeoplegroupbYAbroad().size());
		System.out.println(p.stream().filter(Q->Q.getAbroad()==true).collect(Collectors.toList()));
		System.out.println(aw.get(true));
		assertEquals(aw.get(true), p.stream().filter(Q->Q.getAbroad()==true).collect(Collectors.toList()));
		
	}

}
