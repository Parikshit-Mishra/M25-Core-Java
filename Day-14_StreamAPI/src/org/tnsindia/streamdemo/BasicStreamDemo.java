package org.tnsindia.streamdemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
	Stream<String>obj=Stream.of("Rajan","Nutan","Babita");
	obj.forEach((i)->System.out.println(i+""));;
	
	List<Integer>obj1=Arrays.asList(new Integer[] {22,33,44,55});
	obj1.forEach((i)->System.out.println(i+""));
	}

}
