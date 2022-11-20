package org.tnsindia.application;
import org.tnsindia.framework.CurrentAcc;
public  class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc []";
	}

	@Override
	public void deposite(float accBal) {
		// TODO Auto-generated method stub
		
	}
	
	

}