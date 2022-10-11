package org.tnsindia.statickeyword;
class C
{	//Static Variable
	public static String str="TNS India";
	
	//static class
	static class D
	{
		 public void print() 
		{
			System.out.println(str);
		}
	}
}

public class DemoOnStaticClass {

	public static void main(String[] args) {
		C.D obj=new org.tnsindia.statickeyword.C.D();
		obj.print();
		//C.D.print();
	}

}
