package com.csi.oop;

class Bank{
	
	int rateOfInterest() {
		return 0;
	}
	
}

class HDfCBank extends Bank{
	
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 11;
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
		
		Bank hdfcBank=new HDfCBank();
		
		Bank iciciBank=new ICICIBank();
		
		Bank sbiBank=new SBIBank();
		
		System.out.println("\n HDFC: "+ hdfcBank.rateOfInterest());
		
		System.out.println("\n ICICI: "+ iciciBank.rateOfInterest());
		
		System.out.println("\n SBI: "+ sbiBank.rateOfInterest());
		
	}

}
