package org.tnsindia.exception;

public class FinallyBlockNotExcecuted {
	
	//It is static because it is out side main function 
	public static void  print()
	{
		try {
		int x=12;
		int y=5;
		System.out.println("Inside try block :"+x/y);
		// no any further statement will execute
		System.exit(0);
		}
		catch (Exception e)
		{
			System.out.println("Catch block");
			
	}   // When finally block contain exception then it will not use
		finally 
		{
			//System.out.println("Finally block");
			int res=34/0;
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
	print();

	}

}
