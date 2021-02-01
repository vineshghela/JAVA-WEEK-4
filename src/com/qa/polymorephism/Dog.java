package com.qa.polymorephism;

public class Dog extends Animal implements Animal_Interface, Dog_Interface {

//	@Override
//	public void animalSound() {
//		System.out.println("dog make a dog sound");
//
//	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goForAWalk() {
		System.out.println("ITS TIME FOR A WALK!!!");

	}

	@Override
	public void youMust(String str) {
		// TODO Auto-generated method stub

	}

}
