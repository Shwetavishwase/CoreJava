package com.csi.coreconcept;

public class EnumConcept {

	public enum Months{
		
		JANUARY,FEEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Months.values());    //It will print an object
		
		for(Months m: Months.values())
		{
			//System.out.println(m);
			
			if(m.toString().equals("MAY"))
			{
				System.out.println("SUMMER");
			}
		}
		
		
	}
}
