package com.qa.person;

public class Runner {

	public static void main(String[] args) {

		// Create person objects
		Person vin = new Person("Vin", 6, "Student");
		Person aswene = new Person("Aswene", 6, "Student");
		Person jordan = new Person("Jordan", 6, "Student");

		Person p = new Person();
//		// add object(s) to the array
		p.addPerson(vin);
		p.addPerson(aswene);
		p.addPerson(jordan);

//
//		// Read all
//		p.readAll();
//		// Find by Name
		p.scan();

		p.startApp();

	}

}
