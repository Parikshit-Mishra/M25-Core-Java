package org.tnsindia.statickeyword;

public class DemoOnStaticBlock {

	static int a=10;
	static int b;
	// Use to initialize static data member 
	static 
	{
		b=a+12;
	}
	
	public static void main(String[] args) {
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
	}

}
