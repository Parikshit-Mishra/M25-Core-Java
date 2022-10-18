package org.tnsindia.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) {
		Set <Integer> obj=new HashSet<>();
		obj.add(56);
		obj.add(52);
		obj.add(51);
		System.out.println(obj);
		/*for (Integer itr:obj)
		{
			System.out.println(itr+" ");
		}*/
		obj.forEach(System.out::println);
	}

}
