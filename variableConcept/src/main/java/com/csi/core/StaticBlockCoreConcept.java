package com.csi.core;

public class StaticBlockCoreConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vishwase");

	}

	static {

		System.out.println("Shweta");
	}

}

//output : Shweta 
//         Vishwase

//Static block executes before the main method