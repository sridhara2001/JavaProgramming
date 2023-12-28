package com.if_else;

import java.util.Scanner;

public class Test_3 {
	public static String getGrade(int mark) {
		if(mark>100) {
			return "Enter valid Marks";	
		}else if(mark>=80) {
			return "Distinction";
		} else if(mark>=60&&mark<80) {
			return "1st Class";
		} else if (mark>=35&&mark<60) {
			return "2nd Class";
		}
			return "try again";
	}

	public static void main(String[] args) {
		System.out.println("Enter your Marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		System.out.println(Test_3.getGrade(marks));
		
		

	}

}
