package com.streamAPI;

import java.util.Arrays;
import java.util.List;

// Calculate Average using stream
public class Problem1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		double average = list.stream().mapToInt(x->x).average().getAsDouble();
		System.out.println(average);
	}

}
