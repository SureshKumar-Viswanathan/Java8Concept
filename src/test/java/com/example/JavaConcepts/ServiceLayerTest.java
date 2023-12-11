package com.example.JavaConcepts;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.Persistence.DataClass;
import com.example.Pojo.Person;
import com.example.services.ServiceLayer;

@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceLayerTest {
	
	  @Mock
	    private DataClass dataClassMock; // Mocked DataClass dependency

	    @InjectMocks
	    private ServiceLayer serviceLayer; // Class under test

	    @Test
	    public void testGetPeople() {
	        // Initialize mocks
	        //MockitoAnnotations.openMocks(this);

	        // Prepare test data
	        List<Person> testPersonList = new ArrayList<>();
	        // Add test persons to the list
	       // Mockito.doReturn(testPersonList).when(dataClassMock.getPersonlist());
	        // Define mock behavior
	        when(dataClassMock.getPersonlist()).thenReturn(testPersonList);

	        // Test the method
	        assertNotNull(serviceLayer); // Assert that serviceLayer is not null
	        assertNotNull(serviceLayer.getPeople()); // Assert that the returned value is not null
	        // You might have more specific assertions based on the behavior of getPeople()
	    }

}
