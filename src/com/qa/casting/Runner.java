package com.qa.casting;

class Runner {

	public static void main(String[] args) {
		// converting from a smaller type to a larger type
		// widening casting - byte-> short -> char->int -> long -> float -> double
		// narrowing casting

		int myInt = 99;
		System.out.println(myInt);// 99

		double myDouble = myInt; // automatically casted from int to double
		System.out.println(myDouble); // 99.0

		// converting from a larger type to a smaller type
		// Narrowing casting (manually)
		// double -> float -> long-> int-> char-> short -> byte
		double myOtherDouble = 9.78;
		int myOtherInt = (int) myOtherDouble;// manually being casted
		System.out.println(myOtherDouble);// 9.78
		System.out.println(myOtherInt);// 9

	}

}
