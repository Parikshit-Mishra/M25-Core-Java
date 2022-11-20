package org.tnsindia.application;

import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class MMBankFactory extends BankFactory{


	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo,accName,accBal,isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo,accName,accBal,creditLimit);
		return c;
	}

}