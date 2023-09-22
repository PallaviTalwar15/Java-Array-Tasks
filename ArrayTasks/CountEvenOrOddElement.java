package com.kn.arrays;

public class CountEvenOrOddElement {
	
public void countEvenOrOddElementInArray(int[] arr) {
	int even_count=0, odd_count=0;

	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even_count++;	
		
		}
		
		else {
			odd_count++;
		}
		
}
	System.out.println("\n=======================");
	System.out.println(" Even count= "+ even_count);
	System.out.println(" oddd count= "+ odd_count);
	
}
}
