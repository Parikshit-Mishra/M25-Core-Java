package org.tnsindia.looping;

import java.util.Scanner;

public class Pattern
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of lines:");
		int n=s.nextInt();	
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
			s.close();
		}
	
}