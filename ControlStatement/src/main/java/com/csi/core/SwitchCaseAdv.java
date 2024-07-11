package com.csi.core;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwitchCaseAdv {
	public static void main(String[] args) {

		System.out.println("\n 1.Add \n 2.Sub \n 3.Mul \n 4.Div");
		System.out.println("Enter your choice: ");

		Scanner scanner = new Scanner(System.in);

		int ch = scanner.nextInt();

		int n1 = 20, n2 = 10, result = 0;

		switch (ch) {

		case 1:

			result = n1 + n2;
			System.out.println("Addition Result: " + result);

			break;

		case 2:

			result = n1 - n2;
			System.out.println("Subtraction result: " + result);

			break;

		case 3:

			result = n1 * n2;
			System.out.println("Multiplication result: " + result);

			break;
		case 4:

			result = n1 / n2;
			System.out.println("Division result: " + result);

			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
	}
}
