package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// Array Declaration and creation.
		System.out.println("Enter the size of Array");
		int [] arr= new int[scan.nextInt()];
		
		// Array Intialization.
		for (int i=0;i<arr.length;i++) {
		System.out.println("\n Enter the "+(i+1)+ " Element of array");
		arr[i]=scan.nextInt();
		}
		
		
		//Object creation
		SumOfArrays sumArray=new SumOfArrays();
		

		System.out.println("=============");
		System.out.println("Sum of Array Elemnts : "+ sumArray.sumOfArrayElemnts(arr));
	}

}
