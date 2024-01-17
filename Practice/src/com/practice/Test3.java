package com.practice;

public class Test3 {
	public static boolean isAnagram(String str, String str1) {
		boolean flag = false;
		if(str.length()==str1.length()) {
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				for(int j=0; j<str1.length(); j++) {
					char ch1 = str1.charAt(j);
					if(ch1==ch) {
						flag=true;
					}else {
						break;
					}
				}
			}
		}else {
			flag=false;
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
