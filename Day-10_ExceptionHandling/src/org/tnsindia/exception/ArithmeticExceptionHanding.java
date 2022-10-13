package org.tnsindia.exception;

import java.util.Scanner;

// Program to handle arithmaticExpression 
public class ArithmeticExceptionHanding {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter value of A: ");
		int a=s.nextInt();
		System.out.println ("Enter value of B: ");
		int b=s.nextInt();
		// try block handling exception code 
		try {
		int result =a/b;
		System.out.println("Final Value : " + result);
		}
		//catch block is used to handle the exception
		catch (Exception e)
		{
			System.out.println (e);
			System.out.println ("Arithmatic Exception handle using catch block");
		}
		//whether any exception occure ot not finally block is always executed 
		finally {
			System.out.println ("finally block is always executed");
		}
		s.close();

	}

}
