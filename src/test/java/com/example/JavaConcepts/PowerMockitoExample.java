package com.example.JavaConcepts;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.example.services.ServiceLayer;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ServiceLayer.class)
public class PowerMockitoExample {
	
    @InjectMocks
    private ServiceLayer serviceLayer;

//    @Test
//    public void testStaticMethod() {
//        mockStatic(ServiceLayer.class); // Mock the static class
//
//        final String expected = "Mocked static message";
//        // Mocking the static method
//        PowerMockito.when(ServiceLayer.retrunSt()).thenReturn(expected);
//
//        ServiceLayer sl = new ServiceLayer();
//        assertEquals(expected, sl.returnStringStatic());
//    }
    
    
    @Test
    public void testReturnStringStatic() throws Exception {
        PowerMockito.mockStatic(ServiceLayer.class); // Mock the class containing the static method
        PowerMockito.when(ServiceLayer.class, "retrunSt").thenReturn("Mocked value"); // Stub the private static method
        
        String result = serviceLayer.returnStringStatic(); // Call the method under test
        
        // Perform assertions based on the returned result
        // For example:
        assertEquals("Mocked value", result);
        
        // Optionally verify that the private static method was called
        PowerMockito.verifyPrivate(ServiceLayer.class, Mockito.times(1)).invoke("retrunSt");
    }
}
