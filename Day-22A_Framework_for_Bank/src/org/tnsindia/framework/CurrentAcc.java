package org.tnsindia.framework;

public abstract class CurrentAcc extends BankAcc{
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+","+"Account Name: "+this.getAccNm()
		+","+"Available credit limit is: "+(accBal+creditLimit));
		System.out.println("You cannot withdraw money if your balance is less than "+(accBal+creditLimit));
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}

} 


