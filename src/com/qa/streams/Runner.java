package com.qa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
//		int[] myArry = {1,2,3,4,5,6,7,8,9};
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 8, 9, 33, 99, 11, 111);
		System.out.println(numbers);
//		for (Integer i : numbers) {
//			System.out.println(i);
//		}

		List<Integer> sqaures = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(sqaures);

		List<String> names = Arrays.asList("Bob", "John", "Steve");
		List<String> result = names.stream().filter(str -> !str.endsWith("n")).collect(Collectors.toList());
		System.out.println(result);
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

//		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		List<Integer> sq = numbers.stream().filter(x -> x % 2 != 1).collect(Collectors.toList());
//		int even = number.stream().filter(x -> x % 2 == 0).reduce((a, b) -> a + b).get();
		System.out.println(sq);
		for (Integer i : numbers) {
//			if(i)
		}
	}

}
