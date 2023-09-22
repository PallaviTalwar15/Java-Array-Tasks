package com.kn.arrays;

public class BinarySearch {

	// method for Searching an Element.
	public void elementSearch(int arr[], int element) {
	
		int low=0,high=arr.length-1,mid,position=-1;
		boolean isElementFound=false;
		
		while(low<=high) {
			
			mid=(low+high)/2;
			
			if( element == arr[mid]) {
				
				isElementFound= true;
				position=mid+1;
				break;
			}
			else if(element>arr[mid]) {
				low= mid+1;
			}
			else {
				high=mid-1;
			}
		}
		
		if(isElementFound) {
			System.out.println("Element"+element+"found in Position"+position);
		}
		else {
			System.out.println(" Element"+element+"not found");
		}
		
	}
}
