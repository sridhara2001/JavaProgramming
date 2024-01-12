package com.practice;

public class Test1 {
	public static int insertProblem(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			} else if(arr[mid]>target){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return high+1; // or you can return low also
	}

	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int target=4;
		System.out.println(insertProblem(arr, target));
		
	}

}
