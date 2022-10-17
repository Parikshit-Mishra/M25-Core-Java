package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectioninterface {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Collection obj = new ArrayList<>();
		obj.add("Parikshit");
		obj.add('X');
		obj.add(90.9f);
		System.out.println("The Elements in collection: "+obj);

	}

}
