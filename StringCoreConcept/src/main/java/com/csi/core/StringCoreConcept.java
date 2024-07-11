package com.csi.core;

public class StringCoreConcept {

	public static void main(String[] args) {
		
		StringBuffer buffer1=new StringBuffer("Shweta");
		
		StringBuffer buffer2=new StringBuffer("Shweta");
		
		buffer1.append(buffer2);
		
		System.out.println(buffer1);
		
		StringBuilder builder1=new StringBuilder("Vishwase");
		
		StringBuilder builder2=new StringBuilder("Vishwase");
		
		builder1.append(builder2);
		
		System.out.println(builder1);
		
		System.out.println(builder1.charAt(3));
		
		
	}
}
