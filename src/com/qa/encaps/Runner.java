package com.qa.encaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("Yellow", "Audi", "A7", 2018, 34000.0);
		Car car1 = new Car("orange", "Audi", "A5", 2018, 34000.0);
		Car car2 = new Car("Red", "BMW", "M5", 2018, 34000.0);
		// System.out.println(car);
		List<Car> list = new ArrayList<>();
		list.add(car);
		list.add(car1);
		list.add(car2);
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		for (Car a : list) {
			if (a.getBrand().contentEquals(val)) {
				System.out.println(val + " found");
			}

		}
		System.out.println("Where my car?");
//
//		for (Car c : list) {
////			System.out.println(c.getModel());
//			if (c.getModel().equals("Honda")) {
//				System.out.println("found");
//				break;
//			}
//		}
//		System.out.println("not found");

	}

}
