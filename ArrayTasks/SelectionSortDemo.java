package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortDemo {
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\n===========Selection Sort============\n");
		
		//  Declaration and creation of  array.
		System.out.println("Enter the  size of  Array");
		int [] arr= new int[scan.nextInt()];
		
		//Intialization of Array.
		System.out.println("Enter the Elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();		
			}
		
		// object for Sorting
		SelectionSort sort =new SelectionSort();
		int brr [] = sort.sort(arr);
		
		// Traversing Array.
		System.out.println("\n=========Sorted Array========\n");
		for (int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
}

}
