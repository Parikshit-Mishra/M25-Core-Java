package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display ()
	{
		System.setProperty("Parikhshit","Mishra");
		Assumptions.assumeTrue("Mishra".equals(System.getProperty("Parikshit")));
	}

	@Test
	void display1()
	{
		System.setProperty("Parikhshit","Mishra");
		Assumptions.assumeFalse("Mishra1".equals(System.getProperty("Parikshit")));
	}
	
		

}
