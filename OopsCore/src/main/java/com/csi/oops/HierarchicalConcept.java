package com.csi.oops;

class Bank{
	
	int rateOfInterest() {
		
		return 0;
	}
}

class HDFCBank extends Bank{
	
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return  11;
	}
}

class ICICIBank extends Bank{
	
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}

class SBIBank extends Bank{
	
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}

public class HierarchicalConcept {
public static void main(String[] args) {
	
	Bank hdfcBank = new HDFCBank();
	Bank iciciBank = new ICICIBank();
	Bank sbiBank = new SBIBank();
	
	System.out.println("\n HDFC: " + hdfcBank.rateOfInterest());
	System.out.println("\n ICICI: " + iciciBank.rateOfInterest());
	System.out.println("\n SBI: " +sbiBank.rateOfInterest());
	
}
}
