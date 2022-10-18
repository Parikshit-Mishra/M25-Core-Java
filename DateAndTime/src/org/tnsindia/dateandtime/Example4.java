package org.tnsindia.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example4 {

	public static void main(String[] args)
	{
		/*
		 * String x="2022-10-18 11:38";
		 * DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:MM");
			LocalDateTime l = LocalDateTime.parse(x, df);
		 */
		LocalDateTime l = LocalDateTime.now();
		DateTimeFormatter df =DateTimeFormatter.ofPattern("MM-dd-yyyy HH:MM:SS");
		String x=l.format(df);
		System.out.println(x);
		//System.out.println(d);
	}
}
