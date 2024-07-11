package com.csi.core;

import java.util.Scanner;

public class HighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter the First number:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		
//		System.out.println("Enter Second Number: ");
//		
//		
//		System.out.println("Enter Third Number: ");
//		int n3= sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1+" is Highest Number.");
		}
		else if(n1>n3) {
			System.out.println(n1+" is Highest Number.");
		}
		else if(n2>n3) {
			System.out.println(n2+" is Highest Number.");
		}
		else {
			System.out.println(n3+" is Highest Number.");
		}
	}

}
