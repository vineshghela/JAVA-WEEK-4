package com.qa.lambdas;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
//		int age = 18;
//		if (age >= 18) {
//			System.out.println("Thank you");
//		} else {
//			System.out.println("ID please ");
//		}
//		// ternary if statement
//		final String msg = age >= 18 ? "Thank you" : "ID please ";

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		// -> - this is lambda
		arrayList.forEach(n -> System.out.println(n));
		System.out.println("----------------");
		arrayList.forEach(n -> {

			if (n % 2 != 1)

				System.out.println(n);
		});

	}

}
