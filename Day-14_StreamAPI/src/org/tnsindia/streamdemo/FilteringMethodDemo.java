package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilteringMethodDemo {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {36,33,4,5});
		//filter(method
		obj1.stream().filter(i->i>58).forEach((i)->System.out.println(i+" "));
		//distnct() method
		obj1.stream().distinct().forEach((i)->System.out.println(i+" "));
		//limit
		obj1.stream().limit(3).forEach((i)->System.out.println(i+" "));
		//Skip
		obj1.stream().skip(3).forEach((i)->System.out.println(i+" "));
	}

}
