package com.qa.constructors;

// class should be blue print  - any car we create follows some logic from here 
class Car {
	// Attributes - DNA
	String Carbrand;
	String Carmodel;
	String colour;
	int doors = 3;

	// Constructor - is the blue print of an project;

	Car(String brand) {
		Carbrand = brand;
	}

	// empty - empty constructor / default constructor
	Car(String brand, String model) {
		Carbrand = brand;
		Carmodel = model;
	}

	Car(String carbrand, String carmodel, String colour) {
		super();// inheritance
		Carbrand = carbrand;
		Carmodel = carmodel;
		this.colour = colour;
		// this provides context saying that this.colour is the one that belongs to the
		// class itself.
	}

	Car(String carbrand, String carmodel, String colour, int doors) {
		super();// inheritance
		Carbrand = carbrand;
		Carmodel = carmodel;
		this.colour = colour;
		this.doors = doors;

	}

//	@Override
//	public String toString() {
//		return "The car is " + Carbrand + " and the Carmodel is " + Carmodel + " it has " + doors + " doors";
//	}

}
