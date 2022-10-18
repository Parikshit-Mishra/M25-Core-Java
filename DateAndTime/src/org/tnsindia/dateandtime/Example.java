package org.tnsindia.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example {

	public static void main(String[] args) {
		//Local date code
		/*LocalDate d = LocalDate.now();
		//Local time code
		LocalTime obj = LocalTime.now();*/
		LocalDateTime obj1=LocalDateTime.now();
		LocalDate obj2=	LocalDate.of(2022, 2, 28);
		//System.out.println(d);
		System.out.println(obj1); 
		System.out.println(obj2);
	}

}
