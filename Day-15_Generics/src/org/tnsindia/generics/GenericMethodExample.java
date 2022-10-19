package org.tnsindia.generics;

public class GenericMethodExample {
		// When we use generic method we can pass any types of argument in method
			public static <E> void printArrey (E[]elem)
			{
				for (E itr:elem)
				{
					System.out.println(itr.getClass().getName());//To check className
					System.out.println(itr);
				}
			}
	public static void main(String[] args) {
		Integer[] arr1 =  {10,20,30};
		Character [] arr2 = {'z','x','a'};
		System.out.println("Printing arrey for Integer");
		printArrey (arr1);
		System.out.println("Printing arrey for Character");
		printArrey (arr2);

	}

}
