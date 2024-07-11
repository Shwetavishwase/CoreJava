package com.csi.core;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("PUNE");
	}
	
	public static void main(String[] args) {
		
		FinalizeConcept concept=new FinalizeConcept();
		
		concept=null;
		System.gc();
	}
}
