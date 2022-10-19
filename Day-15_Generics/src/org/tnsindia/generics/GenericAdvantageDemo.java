package org.tnsindia.generics;
// Demo on Advantage of Generic concept 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericAdvantageDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List <Integer>obj = new LinkedList<>();
		obj.add(12);
		//obj.add("parikshit");
		//obj.add(12.98f);
		System.out.println(obj);
		//2.type  casting is not required
		List <Double> obj2 =new ArrayList<>();
		obj2.add(1512345.3);
		@SuppressWarnings("unused")
		Double d=obj2.get(0);
		//3.Compile-time-checking
		System.out.println(obj2);	
	}
}
