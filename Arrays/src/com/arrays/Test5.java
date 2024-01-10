package com.arrays;

public class Test5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,9,11}; // Use Binary Search Algorithm
		int target=9;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				System.out.println("The index number of target "+target+" is "+mid);
				break;
			}
			if(arr[mid]>target) {
				high=mid-1;
			}
			if(target>arr[mid]) {
				low=mid+1;
			}
		}

	}

}
