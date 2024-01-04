package com.string;

// Reverse a String
public class Test5 {

	public static void main(String[] args) {
		String str = "Java";
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
