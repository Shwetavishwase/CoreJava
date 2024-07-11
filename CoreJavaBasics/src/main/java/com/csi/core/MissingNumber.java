package com.csi.core;

public class MissingNumber {
	public static void main(String [] args) {

		int [] arr = {1,5,3,2};
		int sumOfAll=0;
		int sumOfArray = 0;
		
//		sumOfAll = (arr.size(arr.size+1))/2;
		
		for(int i=0; i<arr.length; i++)
		{
			sumOfArray = sumOfArray + arr[i];
		}
		
		int missingNumber = sumOfAll - sumOfArray;
		
		System.out.println(missingNumber);
	}
}
