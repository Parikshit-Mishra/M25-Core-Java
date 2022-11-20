package org.tnsindia.application;

import org.tnsindia.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc []");
	}

	@Override
	public void deposite(float accBal) {
		// TODO Auto-generated method stub
		
	}

}