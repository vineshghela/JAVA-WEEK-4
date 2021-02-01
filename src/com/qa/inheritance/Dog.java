package com.qa.inheritance;

public class Dog extends Animal {

	private String breed;
	private boolean play;

	public void speak() {
		System.out.println("Woof");
	}

	public Dog(boolean goForAWalk, String colour, String breed, boolean play) {
		super(goForAWalk, colour);
		this.breed = breed;
		this.play = play;
	}

	public Dog() {
		super();
	}

}
