package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJunit5test {

	@Test
	// It will perform testing on the method
	void test() {
		System.out.println("Hello Parikshit");
	}
	@Test
	@Disabled
	void display() {
		fail ("hi");
	}
	

}
