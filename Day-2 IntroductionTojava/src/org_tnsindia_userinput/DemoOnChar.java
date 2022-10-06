package org_tnsindia_userinput;

import java.util.Scanner;

public class DemoOnChar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Value of X: ");
		char x=s.next().charAt(3);
		System.out.print("The Result is : ");
		System.out.print(x);
	}

}
