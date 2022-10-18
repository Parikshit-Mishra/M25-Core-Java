package org.tnsindia.dateandtime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {

		LocalTime t=LocalTime.now(ZoneId.of("America/North_Dakota/Center"));
		System.out.println(t);
		for (String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
