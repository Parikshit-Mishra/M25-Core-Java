package org.tnsindia.generics;

public class GenericsClassExample<T> {
	T num;
	public void show()
	{
		System.out.println(num.getClass().getName());
	}
	public static void main(String[] args) {
		//Instead of collection i have use generic class name and generic concept 
		GenericsClassExample<Double>obj=new GenericsClassExample<>();
		obj.num=12.34;
		obj.show();

	}

}
