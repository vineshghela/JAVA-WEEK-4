package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		Car vinsCar = new Car("BMW", "M3", "red", 5);
		Car asweneCar = new Car("Fiat", "500");
		Car piersCar = new Car("ford");

		System.out.println(asweneCar);
		System.out.println(piersCar);

		Person vin = new Person("Vinesh", 167.0, 7);
		System.out.println(vin);

		Person who = new Person();
		System.out.println(who);

	}

}
