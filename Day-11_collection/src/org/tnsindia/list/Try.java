package org.tnsindia.list;

import java.util.ArrayList;

public class Try {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("JAVA");
		list.add("Servlets");
		list.add("JAVA");
		list.add("STRUTS");
		System.out.println(list);
		System.out.println(list.indexOf("JAVA"));
		System.out.println(list.lastIndexOf("JAVA"));

	}

}
