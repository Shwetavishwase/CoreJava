package com.csi.core;

public class Demo {

	public static void main(String [] args) {
		
		int [] array= {2,5,9,8,3};
		int temp = 0;
		
		System.out.println("Elements in original array: ");
		
		for(int i=0; i< array.length; i++)
		{
			System.out.println(array[i] + " ");
		}
		
		for(int i=0; i< array.length; i++)
		{
			for(int j=i+1; j< array.length; j++)
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("Elements in ascending order: ");
		
		for(int i=0; i< array.length; i++)
		{
			System.out.println(array[i] + " ");
		}
		
		
	}
}
