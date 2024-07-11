package com.csi.core;

import java.util.Arrays;

public class RepeatedCharWithOccurance {

	public static void main(String[] args) {
		
		String str= "Ahemednagar";
		
		char a[]=str.toCharArray();
		
		System.out.println(a);
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length;i++)
		{
			int c=1;
			
			char t=a[i];
			
			for(int j=i+1; j<a.length;j++) {
			
				if(t==a[j])
				{
					c++;
					i++;
					
				}
				else {
					break;
				}
				
			}
			if(c >1)
			{
				System.out.println(t +":"+ c);
			}
		}
	}
}
