package com.qa.inheritance;

public class Cat extends Animal {

	private String breed;
	private boolean play;

	public void speak() {
		System.out.println("Meow");
	}

	public Cat(boolean goForAWalk, String colour, String breed, boolean play) {
		super(goForAWalk, colour);
		this.breed = breed;
		this.play = play;
	}

	public Cat() {
		super();
	}

}
