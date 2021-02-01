package com.qa.polymorephism;

public class Cat extends Animal implements Animal_Interface {

//	@Override
//	public void animalSound() {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void youMust(String str) {
		System.out.println("You need to define the body" + str);

	}

}
