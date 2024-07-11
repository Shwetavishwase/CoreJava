package com.csi.core;

public class StaticCoreConcept {

	public static void main(String args[]) {

		System.out.println("HELLO");
		StaticCoreConcept concept = new StaticCoreConcept();
		concept.show();
		get();

	}

	void show() {
		System.out.println("PUNE");
	}

	static {// static block execute before main method
		System.out.println("INDIA");
	}
	
	static {// static block execute before main method
		System.out.println("hsgd");
	}
	static {// static block execute before main method
		System.out.println("adafe");
	}

	static void get() {
		System.out.println("WELCOME");
	}
}
