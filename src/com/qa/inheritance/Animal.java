package com.qa.inheritance;

public class Animal {

	public boolean goForAWalk;
	public String colour;

	public void speak() {
		System.out.println("I make a noise");
	}

	public Animal(boolean goForAWalk, String colour) {
		super();
		this.goForAWalk = goForAWalk;
		this.colour = colour;
	}

	public Animal() {
		super();
	}

}
