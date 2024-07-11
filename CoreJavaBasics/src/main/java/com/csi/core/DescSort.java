package com.csi.core;



public class DescSort {
	
    public static void main(String [] args)
    {
    	int [] arr = {2,7,3,9,1};
    	int temp = 0;
    	
    	System.out.println("Elements present in array: ");
    	
    	for(int i=0; i < arr.length; i++)
    	{
    		System.out.println(arr[i] + " ");
    	}
    	
    	for(int i=0; i < arr.length; i++)
    	{
    		for(int j = i+1; j< arr.length; j++)
    		{
    			if(arr[i] < arr[j])
    			{
    				temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	
    	System.out.println("Elements in Descending order: ");
    	
    	for(int i = 0; i< arr.length; i++)
    	{
    		System.out.println(arr[i]+ " ");
    	}
    }
}
