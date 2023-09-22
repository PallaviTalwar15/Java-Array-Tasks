package com.kn.arrays;

import java.util.Scanner;

public class MergeArrays {

public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//  Declaration and creation of 2 arrays.
		System.out.println("Enter the  size of 1st Array");
		int [] arr= new int[scan.nextInt()];
		
		
		System.out.println("Enter the  size of 2nd Array");
		int [] brr= new int[scan.nextInt()];
		
		
		// Declaration and creation of Resultant Array
		int [] crr= new int[arr.length+ brr.length];
		
		
		
		// Array Intialization of 2 arrays.
		
		System.out.println("\n Enter the  Elements of  1st array");
		for (int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
		}
	
		System.out.println("\n Enter the  Elements of  2nd array");
		for (int i=0;i<brr.length;i++) {
			brr[i]=scan.nextInt();
			}
		
		
		//calling the method for Merging 
		 mergeArray(arr,brr);
		
	

}


// Megreing method
public static void mergeArray(int[] arr, int[] brr) {
	int [] crr= new int[arr.length+ brr.length];
	
	
	for( int i=0;i<arr.length;i++) 
		{
		crr[i]=arr[i];
		}
		
		int j=0;
		for ( int i=arr.length;i<crr.length;i++) {
			crr[i]=brr[j];
			j++;
		
	}
		
		
		// Megred Array Traversal
		System.out.println("================");
		System.out.println(" Merged Array\n");
		
		for ( int i=0;i<crr.length;i++) {
		System.out.println( crr[i]+" " );
		}
		
	
}
}


