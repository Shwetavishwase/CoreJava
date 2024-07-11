package com.csi.core;

public class RepeatedCharactersInstring {

	public static void main(String[] args) {

		String name = "Pratap";
		
		char str[]= name.toLowerCase().toCharArray();
		
		System.out.println(str);
		
		for(int i=0; i<str.length;i++) {
			
			for(int j=i+1; j< str.length; j++) {
				
				if(str[i] == str[j])
				{
					System.out.println(str[i]);
				}
			}
		}
		
	}
}
