package com.qa.hashMaps;

import java.util.HashMap;

public class Runner {
	public static void main(String[] args) {
//		k - key 
//		v - value
		// wrapper class is used to treat a primitive type as a object
//		int - a primitive type 8
//		Integer - wrapper class object
		HashMap<Integer, String> cars = new HashMap<Integer, String>();
		cars.put(1, "Audi - S7");
		cars.put(2, "Audi - A1");
		cars.put(3, "BMW - M5");
		cars.put(4, "BMW - M3");
		System.out.println(cars);
		System.out.println(cars.get(1));
		cars.remove(4);
		for (Integer i : cars.keySet()) {
			System.out.println(i);
		}
		for (String i : cars.values()) {
			System.out.println(i);
		}
		for (Integer i : cars.keySet()) {
			System.out.println("Key is: " + i + " Value is " + cars.get(i));
		}

	}

}
