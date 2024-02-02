package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// Creating Stream of Objects
		List<Integer> list = new ArrayList<>();
		 for(int i=1; i<=10; i++) {
			 list.add(i);
		 }
		 
		 List<Integer> list1 = Arrays.asList(11,12,13,14,15,16,17);
		 
		 // 1st Way
		 // stream()
		 Stream<Integer> stream = list.stream();
		 
		 // 2nd Way
		 // of()
		 Stream<String> stream1 = Stream.of("Sridhar", "Likhith", "Chida");
		 Stream<Integer> stream2 = list1.stream();
		 
		 // Intermediate-Operations and Terminal-Operation
		 // filter
		 List<Integer> evenList = stream.filter(x->x%2==0).collect(Collectors.toList());
		 System.out.println(evenList);
		 
		 // map-->
		 List<Integer> evenSquareNumber = stream2.filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
		 System.out.println(evenSquareNumber);
		 
		 // sorted()
//		 List<String> stringArr = stream1.sorted().collect(Collectors.toList());
//		 System.out.println(stringArr);
		 stream1.sorted().forEach(System.out::println);
		 
		 List<Integer> data = Arrays.asList(1,2,1,3,1,4,2,4,3,5);
		 data.stream().distinct().forEach(System.out::println);
		 
		 // anyMatch()
		 List<String> name = Arrays.asList("Sridhar", "Chida", "Amogha", "Likhith");
		 boolean result = name.stream().anyMatch(x->x.startsWith("A"));
		 System.out.println(result);
		 
		 // allMatch()
		 boolean result1 = name.stream().allMatch(x->x.startsWith("A"));
		 System.out.println(result1);
		 
		 // reduce()
		 List<Integer> elements = Arrays.asList(1,2,3,4,5,6);
		 int sum = elements.stream().reduce((a,b)->a+b).get();
		 System.out.println(sum);
	}

}
