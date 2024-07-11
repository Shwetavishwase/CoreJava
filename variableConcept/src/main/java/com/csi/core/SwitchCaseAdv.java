package com.csi.core;

import java.util.Scanner;

public class SwitchCaseAdv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n 1.Add \n 2.Sub \n 3.Mul \n 4.Div");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		
		int n1 = 20, n2 = 10, result = 0;

		switch (ch) {

		case 1:

			result = n1 + n2;
			System.out.println("\n Addition Result: " + result);
			break;

		case 2:
			result = n1 - n2;
			System.out.println("\n Substraction Result: " + result);
			break;

		case 3:
			result = n1 * n2;
			System.out.println("\n Multiplication Result: " + result);
			break;

		case 4:
			result = n1 / n2;
			System.out.println("\n Division Result: " + result);
			break;

		default:
			System.out.println("Default Case");
			break;

		}

	}

}
