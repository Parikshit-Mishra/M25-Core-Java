package org.tnsindia.dateandtime;

import java.time.Clock;

public class Example3 {

	public static void main(String[] args) {
		
		Clock c=Clock.systemUTC();
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c);
		System.out.println(c1);
	}
}
