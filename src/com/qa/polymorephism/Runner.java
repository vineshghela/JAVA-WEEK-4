package com.qa.polymorephism;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// an abstract class cant be be used to create objects.
//		Animal myAnimal = new Animal(); 

		Animal myAnimal2 = new Pig();
		Animal myAnimal3 = new Dog();
		Dog dog = new Dog();
//		Dog dog = new Dog();
//		List<Dog> dogList = new ArrayList<>();
//		dogList.add(dog);
//		System.out.println(dogList);

//		myAnimal2.animalSound();// oink oink
		myAnimal3.animalSound();// woof woof
		// casting types
//		((Pig) myAnimal2).runs(); // automatic casting
//		myAnimal2.runs();

		dog.animalSound();
//		dog.goForAWalk();
//		myAnimal2.animalSound();

//		Static type is the type the compiler sees, which is Animal in this case. 
//      This is also the type of the variable. This will define which methods are available.

//		Dynamic type is the type that is defined at runtime, 
		// it is the "real" type of the variable, which defines its behaviour.

		Cat cat = new Cat();
		System.out.print(2.0);
		Scanner sc = new Scanner(System.in);
		int Str2 = sc.nextInt();
		System.out.println(Str2);
// hasNextInt - boolean -> use with if, while any conditionals
		cat.youMust("apples");
	}

}
