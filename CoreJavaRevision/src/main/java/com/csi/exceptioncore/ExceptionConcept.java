package com.csi.exceptioncore;

import java.util.Scanner;

public class ExceptionConcept {
	public static void main(String[] args) {

		System.err.println("Enter a company name: ");
		
		//try without catch and finally i.e try with resources
		
		try(Scanner scanner=new Scanner(System.in)){     
			
			String cName=scanner.nextLine();
			
			System.out.println(cName);
		}
		
		
	}
}
