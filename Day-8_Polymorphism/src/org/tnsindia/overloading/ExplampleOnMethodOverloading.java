package org.tnsindia.overloading;

class Shape
{    // method overloading
	// Zero-arg
	public void area ()
	{
		System.out.println("Finad Area:");
	}
	public void area (int r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
	public void area (int l, int b)
	{
		System.out.println("Area of Rectangle:"+(l*b));
	}
}
// for method overloading child class is not required
public class ExplampleOnMethodOverloading {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.area();
		s.area(4);
		s.area(6, 3);

	}

}
