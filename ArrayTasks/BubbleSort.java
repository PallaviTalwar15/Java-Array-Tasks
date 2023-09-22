package com.kn.arrays;

public class BubbleSort {

	public int[] sort(int arr[]) {
		
		int temp=0;
		
		
		// Loop for Pass 
		for(int i=0;i<arr.length;i++)
		{
			boolean swapped=false;
			
			// Comparing Values in array
			for(int j=0;j<arr.length-1-i;j++) {
				
				//Swaping of Elements
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				 
				swapped=true;
				
				
			}
			
			if(swapped==false)
			{
				break;
			}
			
		}
		
		return arr;
	}
		
	}
	
