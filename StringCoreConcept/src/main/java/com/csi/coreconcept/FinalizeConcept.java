package com.csi.coreconcept;

public class FinalizeConcept {

	protected void finalize() {

		System.out.println("SHWETA");
	}

	public static void main(String[] args) {

		FinalizeConcept concept = new FinalizeConcept();

		concept = null;

		System.gc();
	}
}
