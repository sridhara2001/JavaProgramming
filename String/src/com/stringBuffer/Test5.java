package com.stringBuffer;

// important question
//Find out longest substring without repeating characters
public class Test5 {

	public static void main(String[] args) {
		String str = "abcabdef"; // Output : abdef
		
		String str1="";
		String[] arr = str1.split(" ");
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			for(int j=0; j<str1.length(); j++) {
				char ch1 = str1.charAt(j);
				if(ch1==ch) {
					str1="";
				}
			}
			str1=str1+ch;
			System.out.print(str1+" ");
//			for(int k=0; k<arr.length; k++) {
//				String word = arr[k];
//				if() {
//					arr=str1.split(str1);
//				}
//				System.out.println(arr);
//			}
		}
		System.out.println();
		
		String str2 = "";
		String[] arr1 = str1.split(" ");
		for(int i=0; i<arr1.length; i++) {
			String word1 = arr1[i];
			if(arr1[i].length()>str2.length()) {
				str2=word1;
			}
		}
		System.out.println("Longest Substring is : "+str2);
		System.out.println("Length of the substring is : "+str2.length());
	}

}
