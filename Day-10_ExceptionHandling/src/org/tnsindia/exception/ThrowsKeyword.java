package org.tnsindia.exception;

import java.io.IOException;

public class ThrowsKeyword {
	 // throw is used to declare the exception
	public static void print (int x)throws IOException,ClassNotFoundException
	{
		if (x==1)
		{
			throw new IOException ("IOException occurred");
		}
		else
		{
			throw new ClassNotFoundException ("ClassNot FoundException");
		}
	}

	public static void main(String[] args) {
		try
		{
			print(5);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		

	}

}
