package com.qa.optionals;

import java.util.Optional;

public class Runner {

	public static void main(String[] args) {
//		Runner runner = new Runner();
		Integer val1 = null;
		Integer val2 = new Integer(10);

		// passed param to be null
		Optional<Integer> list = Optional.ofNullable(val1);

		// throw a null point if the passed param is null
		Optional<Integer> list2 = Optional.of(val2);

		System.out.println(sum(list, list2));
	}

	public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
//		we are checking is the value is there or not!
		System.out.println("A is here " + a.isPresent());
		System.out.println("B is here " + b.isPresent());

		// only return if no value is present
		Integer value1 = a.orElse(new Integer(1000));

		// optionals.get - get the value "shoudl be present"
		Integer value2 = b.get();
		System.out.println("pineapples");
		return value1 + value2;

	}
}
