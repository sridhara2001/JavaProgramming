package com.string;

//Converting string from UpperCase to LowerCase without using predefined function
public class Test6 {

	public static void main(String[] args) {
		String str = "JAVA";
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			char ch1 = (char)(ch+32);
			str1=str1+ch1;
		}
		System.out.println(str1);
	}

}
