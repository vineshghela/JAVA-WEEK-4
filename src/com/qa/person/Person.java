package com.qa.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	String jobTitle;

	private List<Person> myList = new ArrayList<>();

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Person :name=" + name + ", age=" + age + ", jobTitle=" + jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// My methods

	public void addPerson(Person p) {
		myList.add(p);
	}

	private Person findByName(String name) {
		for (Person p : myList) {
			if (p.getName().equals(name)) {
				System.out.println("Person with name " + name + " found\n " + p.toString());
				return p;
			}
		}
		System.out.println("Person with name " + name + " not fond");
		return null;

	}

	public void readAll() {
		myList.stream().forEach(x -> System.out.println(x));
	}

	public void scan() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the name of the person you want to find");
			String p2Find = sc.nextLine();
			findByName(p2Find);
			System.out.println("To exit type 'q'");
		} while (!sc.nextLine().equals("q"));

		System.out.println("Good bye!");
	}

	public void startApp() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Welcome");
			System.out.println("Press 1 to Create a Person");
			System.out.println("Press 2 read all persons ");
			System.out.println("Press 3 to find a person by name");
			String p2Find = sc.nextLine();

			System.out.println("To exit type 'q'");
		} while (!sc.nextLine().equals("q"));

		System.out.println("Good bye!");
	}

	public void choices(String choice) {
		switch (choice) {
		case "1":
			System.out.println("add a nre person");
			break;

		case "2":
			readAll();
			break;
		case "3":
			scan();
			break;
		default:
			break;
		}

	}

}
