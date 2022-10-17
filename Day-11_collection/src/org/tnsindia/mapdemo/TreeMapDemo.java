package org.tnsindia.mapdemo;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		//SortedMap<String,String> obj=new TreeMap<>();
		NavigableMap<String,String> obj=new TreeMap<>();
		obj.put("Parikshit","Student");
		obj.put("Nia","Engineer");
		obj.put("Ashwini","Doctor");
		System.out.println(obj);
		obj.put("Shiwani",null);
		System.out.println(obj);
		
		for (Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(obj.firstEntry());
		System.out.println(obj.lastEntry());
		System.out.println(obj.lastKey());
	}

}
