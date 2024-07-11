package com.csi.coreconcept;

import java.util.Scanner;

public class EnumCoreConcept {

	enum Tier {

		TCS, INFOSYS, WIPRO
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter the company name: ");

		String cName = scanner.nextLine();
		boolean flag = false;

		for (Tier t : Tier.values()) {
			// System.out.println(t);

			if (t.toString().equals(cName)) {
				flag = true;
			}

			/*
			 * if(t.toString().equals(cName)) {
			 * System.out.println("Yes, its in top 3 tier"); break; } else {
			 * System.out.println("Not in 3 tier"); break; }
			 */
		}
		if (flag) {
			System.out.println("Yes its in top 3 tier");

		} else {
			System.out.println("Not in 3 tiers");
		}
	}
}
