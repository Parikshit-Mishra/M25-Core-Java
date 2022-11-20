package org.tnsindia.framework;

public abstract class NormalAcc extends ShopAcc{
	
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accName, float charges, float deliveryCharges) {
		super(accNo, accName, charges);
		this.deliveryCharges = deliveryCharges;
		
		
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccName()
		+","+"Charges is: "+(charges+deliveryCharges));
}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	

}
