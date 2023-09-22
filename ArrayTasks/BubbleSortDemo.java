package com.kn.arrays;

import java.util.Scanner;

public class BubbleSortDemo {

public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\n===========Bubble Sort============\n");
		
		//  Declaration and creation of  array.
		System.out.println("\nEnter the  size of  Array");
		int [] arr= new int[scan.nextInt()];
		
		//Intialization of Array.
		System.out.println("\nEnter the Elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();		
			} 
		
		// object for Sorting
		BubbleSort array=new BubbleSort();
		
		
		System.out.println("\n=========Sorted Array================");
		for(int i : array.sort(arr)) {
			System.out.print(i+" ");
		}
}
}

