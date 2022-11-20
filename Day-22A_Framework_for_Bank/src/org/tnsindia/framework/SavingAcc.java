package org.tnsindia.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	static final private float MINBAL=1000.0f;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+","+"Account Name: "+this.getAccNm()+","+"Saving account Balance is: "+this.getAccBal());
		System.out.println("You can withdraw the money");
	}
	
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}

}

