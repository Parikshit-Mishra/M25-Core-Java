package org.tnsindia.framework;

//abstract method
public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAcc(int accNo, String accName, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBal, float creditLimit);
}