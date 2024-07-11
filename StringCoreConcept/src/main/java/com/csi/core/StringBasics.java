package com.csi.core;

public class StringBasics {

	public static void main(String[] args) {
		
		String s1="Shweta";
		
		String s2= new String("Shwetaz");
		
		System.out.println("\n s1==s2 : "+  s1==s2);  //false
		
		System.out.println("\n s1.equals(S2): "+ s1.equals(s2));  //false
		
		System.out.println("\n s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));
		
		s1.concat(s2);  //immutable
		
		System.out.println(s1);
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.toLowerCase());
	}
}
