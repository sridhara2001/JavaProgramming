package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Test8 {
	public static void repeatingNum(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int data:arr) {
			if(map.containsKey(data)) {
				map.put(data, map.get(data)+1);
			}else {
				map.put(data, map.getOrDefault(data, 1));
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,4,5,6};
		repeatingNum(arr);

	}

}
