package com.csi.core.staticconcept;

class Employee {

}

public class StaticCore {

	public static void main(String[] args) {

		StaticCore core = new StaticCore();

		core.show();
		set();

		System.out.println("Welcome to static core concept");
	}

	static void set() {
		System.out.println("Pune");
	}

	void show() {
		System.out.println("Pimpri");
	}

	static {
		System.out.println("India");
	}
}
