package org.tnsindia.dateandtime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

public class Example2 {

	public static void main(String[] args) {
		//ZonedDateTime obj = ZonedDateTime.now();
		//System.out.println(obj);
		
		 OffsetDateTime d =  OffsetDateTime.now();
		 OffsetTime di =OffsetTime.now();
		 System.out.println(d);
		 System.out.println(di);
	} 

}
