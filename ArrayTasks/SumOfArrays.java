package com.kn.arrays;

public class SumOfArrays {

	public int sumOfArrayElemnts(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum =sum+arr[i];
		}
		return sum;
	}
}
