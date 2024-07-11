package com.csi.core;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the First Number:");
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();

		System.out.println("Enter second number:");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " is Higher Number.");
		} else {
			System.out.println(n2 + " is Higher number.");
		}
	}

}
