package com.kn.arrays;

import java.util.Scanner;

public class BinarySearchDemo {
	
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//  Declaration and creation of  array.
		System.out.println("Enter the  size of  Array");
		int [] arr= new int[scan.nextInt()];
		
		//Intialization of Array.
		System.out.println("Enter the Elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();		
			}
		
		//Element to Find in array
		System.out.println("Enter the element to be searched:");
		int element=scan.nextInt();
		
		//Object Creation
		BinarySearch search=new BinarySearch();
		search.elementSearch(arr,element);
	
		

}
}