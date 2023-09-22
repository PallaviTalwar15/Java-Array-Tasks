package com.kn.arrays;

import java.util.Scanner;

public class MergeArray2 {
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//  Declaration and creation of 2 arrays.
		System.out.println("Enter the  size of 1st Array");
		int [] arr= new int[scan.nextInt()];
		
		
		System.out.println("Enter the  size of 2nd Array");
		int [] brr= new int[scan.nextInt()];
		
		
		
		System.out.println("Enter the  size of 3rd Array");
		int [] crr= new int[scan.nextInt()];
		
		
		
		// Array Intialization of 3 arrays.
		
		System.out.println("\n Enter the  Elements of  1st array");
		for (int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
		}
	
		System.out.println("\n Enter the  Elements of  2nd array");
		for (int i=0;i<brr.length;i++) {
			brr[i]=scan.nextInt();
			}
		
		
		System.out.println("\n Enter the  Elements of  3rd array");
		for (int i=0;i<crr.length;i++) {
			crr[i]=scan.nextInt();
			}
		
		//calling the method for Merging 
		 mergeArray(arr,brr,crr);

}

public static void mergeArray(int[] arr, int[] brr, int[] crr) {
	 
	
	int drr[]=new int[arr.length+brr.length+crr.length];
	 
	for(int i=0;i<arr.length;i++) {
		drr[i]=arr[i];
		}
		
	
		int j=0;
	for(int i=arr.length;i<(arr.length+brr.length);i++) {
		drr[i]=brr[j];
		j++;
		}
	
	int k=0;
	for(int i=(arr.length+brr.length);i<drr.length;i++) {
		drr[i]=crr[k];
		k++;
	}
	
	
	// array Traversal
	
	System.out.println(" ==================\n Merged Array:");
	for(int i=0;i<drr.length;i++) {
		
		System.out.println(drr[i]+" ");
	}
}
}

