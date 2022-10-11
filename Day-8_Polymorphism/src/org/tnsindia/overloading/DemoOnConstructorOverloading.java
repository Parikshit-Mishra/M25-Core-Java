package org.tnsindia.overloading;

class Renault
{
	public String engine;
	Renault (String engine)
	{
		this.engine=engine;
	}
	Renault()
	{
		System.out.println ("Default constructor");
	}
	public void display ()
	{
		System.out.println ("Engine is : Disel");
	}
}	
public class DemoOnConstructorOverloading {

	public static void main(String[] args) {
		 Renault r = new  Renault();
		 
		 Renault r1 = new Renault("Disel");
		 r.display();
		 r1.display();
	}

}
