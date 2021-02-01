package com.qa.polymorephism;

// this is not an access modifier ... public , private, default, protected
// An abstract class can have methods with or without a body!
public abstract class Animal {

	// To access an abstract class it must be inherited from another class.
	public String animalSound() {
		System.out.println("make some noise");
		return "";
	}

	public abstract void youMust(String str);

//	public abstract void has3Eyes();

	// if something is abstract then we impletment the methods where it is extended
//	public abstract void sleep();

	// a method that is not abstract does not have to be implemented.
//	public void poop() {
//		System.out.println("we Poop");
//	}

//	public void runs() {
//		System.out.println("runninggg");
//
//	}

}
