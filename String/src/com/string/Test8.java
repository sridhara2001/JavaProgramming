package com.string;

// Reverse Word
public class Test8 {
	public static void reverseWord(String str) {
		String[] arr = str.split(" ");
		String str1 = "";
		for(int i=0; i<arr.length; i++) {
				str1=str1+" "+getReverse(arr[i]);
		}
		System.out.println(str1);
	}

	 private static String getReverse(String str) {
		 String rev = "";
			for(int i=str.length()-1; i>=0; i--) {
				rev = rev+str.charAt(i);
			}
			return rev;
	}

	public static void main(String[] args) {
		String str = "Programming language";
		reverseWord(str);

	}

}
