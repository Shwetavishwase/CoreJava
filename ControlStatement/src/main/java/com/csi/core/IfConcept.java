package com.csi.core;

import java.util.Scanner;

public class IfConcept {

	public static void main(String[] args) {
		
		System.out.println("Please enter age: ");
		
		Scanner scanner= new Scanner(System.in);
		
		int age= scanner.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Eligible for Vote.");
		}
		else {
			System.out.println("Not Eligible for vote.");
		}
		
	}
}
