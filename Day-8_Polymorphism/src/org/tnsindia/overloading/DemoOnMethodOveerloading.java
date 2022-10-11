package org.tnsindia.overloading;

class MathematicalOpration
{
	public void addition (int a,int b)
	{
		System.out.println("The sum is :"+(a+b));
	}
	public void addition (float a,int b)
	{
		System.out.println("The sum is :"+(a+b));
	}
}

public class DemoOnMethodOveerloading {

	public static void main(String[] args) {
	
		MathematicalOpration m = new MathematicalOpration();
		m.addition(12.4f, 43);
		m.addition(33, 22);

	}

}
