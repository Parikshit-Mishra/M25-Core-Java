package org.tnsindia.setdemo;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Object> s= new LinkedHashSet<>();
		s.add("Parikshit");
		s.add("P");
		s.add(34.5f);
		s.add(90);
		s.add("Parikshit");
		s.add(null);
		
		System.out.println(s);
		
		for (Object itr:s)
		{
			System.out.println(itr);
		}
		
		

	}

}
