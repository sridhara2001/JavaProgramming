package com.abstraction;

interface Bank{
	// This is public, static and final by default
	int sharePrice = 123;
	
	double rateOfInterest(); // abstract method. Here no need of declaring abstract
	
	// To declare concrete method inside interface use Default Keyword
	public default void FD() {
		System.out.println("FD Service is available");
	}
	
	// Static method
	public static void LoanService() {
		System.out.println("Loan Service is available");
	}
}

// implements means giving the functionality
class SBI implements Bank{

	@Override
	public double rateOfInterest() {
		return 13.25;
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
//		Bank bank = new Bank(); // We can't create object of interface
		System.out.println(Bank.sharePrice);
//		Bank.sharePrice = 145;
		Bank.LoanService();
		
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		sbi.FD();

	}

}
