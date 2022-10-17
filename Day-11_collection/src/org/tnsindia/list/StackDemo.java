package org.tnsindia.list;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack <Integer> s =new Stack <>();
		//push -Insertion
		s.push(1);
		s.push(5);
		s.push(8);
		System.out.println(s);
		s.pop();
		//s.remove(0);//it will delete zero index
		System.out.println(s);
		
	}

}
