package com.arrays;

public class Test4 {

	public static void main(String[] args) {
		int[] arr = {1,5,20,15,10};
		int n = arr.length;
		if(arr[0]>arr[1]) {
			System.out.println("The index number is "+0+" and number is "+arr[0]);
		}
		if(arr[n-1]>arr[n-2]) {
			System.out.println("The index number is "+(n-1)+" and number is "+arr[n-1]);
		}
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]<=arr[i] && arr[i]>=arr[i+1]) {
				System.out.println("The index number is "+i+" and number is "+arr[i]);
			}
		}
	}

}
