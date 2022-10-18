package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class MappinDemo {

	public static void main(String[] args) {
		List<String> obj =Arrays.asList(new String[]{"Nayna,Lekha,Tapsi,ISHA"});
		obj.stream().map(i->i.length()).forEach((i)->System.out.println(i+""));

	}

}
