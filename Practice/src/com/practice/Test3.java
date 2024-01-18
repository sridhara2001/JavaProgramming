package com.practice;

import java.util.Arrays;

// Anagram String
public class Test3 {
	public static boolean isAnagram(String str, String str1) {
		boolean flag = false;
		if(str.length()==str1.length()) {
			char[] arr1 = str.toCharArray();
			char[] arr2 = str1.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2)) {
				flag=true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String str = "cat";
		String str1 = "rat";
		boolean result = Test3.isAnagram(str, str1);
		if(result) {
			System.out.println(result);
		}else {
			System.out.println(result);
		}
	}

}
