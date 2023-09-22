package com.kn.arrays;

public class ArrayBack {

		public void printArrayElements(int[] arr) {
			System.out.println("============================");
			System.out.println(" Array Elements are as follows");
			for(int i=arr.length-1 ;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}

	}


