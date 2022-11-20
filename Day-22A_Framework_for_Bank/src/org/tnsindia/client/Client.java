package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;

import org.tnsindia.application.MMCurrentAcc;

import org.tnsindia.application.MMSavingAcc;

import org.tnsindia.framework.BankFactory;

import org.tnsindia.framework.CurrentAcc;

import org.tnsindia.framework.SavingAcc;


public class Client {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(101, "Kiran", 30000, true);
		CurrentAcc c=new MMCurrentAcc(101, "Amar ", 30000, 60000);
		
		System.out.println("Savings Account Details:");
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account Details:");
		c.withdraw(c.getAccBal());

	}

}