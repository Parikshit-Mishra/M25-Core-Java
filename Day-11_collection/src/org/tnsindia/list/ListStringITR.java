package org.tnsindia.list;

import java.util.ArrayList;
import java.util.List;

public class ListStringITR {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List<String> list = new ArrayList<>();
		list.add("Shivani");
		list.add("Parikshit");
		list.add("Isha");
		for (String itr:list) {
			System.out.println(list);
		}
	}
}
