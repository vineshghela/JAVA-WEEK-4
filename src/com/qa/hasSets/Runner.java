package com.qa.hasSets;

import java.util.HashSet;

public class Runner {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Merc");
		cars.add("Honda");
		cars.add("Volvo");
		cars.add("volvo");
		System.out.println(cars.size());

		cars.forEach(x -> System.out.println(x));
		System.out.println(cars.contains("Merc"));// True
		System.out.println(cars.contains("merc")); // False?
		cars.remove("Volvo");
		cars.clear();
		cars.forEach(x -> System.out.println(x));
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
