package com.kn.arrays;

import java.util.Scanner;

public class InsertionSortDemo {

public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\n===========Insertion Sort============\n");
		
		//  Declaration and creation of  array.
		System.out.println("Enter the  size of  Array");
		int [] arr= new int[scan.nextInt()];
		
		//Intialization of Array.
		System.out.println("Enter the Elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();		
			}
		
		// object for Sorting
		InsertionSort sort =new InsertionSort();
		int brr [] = sort.sort(arr);
		
		//Traversing of Array
		System.out.println("======Sorted Array======");
		for(int i : brr) {
			System.out.println(i+" ");
		}
}
}
