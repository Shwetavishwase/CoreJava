package com.csi.core;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		
		System.out.println("Please enter the marks: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int marks=scanner.nextInt();
		
		if(marks >= 65)
		{
			System.out.println("First Class with Distincion");
		}
		else if (marks <68 && marks >=60) {
			System.out.println("First Class");
		}
		else if (marks<60 && marks>=55) {
			System.out.println("Higher Second class.");
		}
		else if (marks<55 && marks>=50) {
			System.out.println("Second class");
		}
		else if (marks<50 && marks>=40) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
