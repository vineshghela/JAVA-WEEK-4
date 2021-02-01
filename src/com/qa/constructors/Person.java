package com.qa.constructors;

public class Person {

	int age = 99;
	String firstName = "Missing ";
	double height = 0.0;

	public Person(String firstName, double height, int age) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.height = height;
	}

	public Person(String firstName, double height) {
		super();
		this.firstName = firstName;
		this.height = height;
	}

	// Default constructor
	public Person() {
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + ", height=" + height + "]";
	}

}
