package org.tnsindia.framework;

public abstract class PrimeAcc extends ShopAcc{
	
	private boolean isPrime;
	static final private float delivarycharges=0.0f;
	//constructor
	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
		
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccName()
		+","+"Charges is: "+this.getCharges());
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
}
}