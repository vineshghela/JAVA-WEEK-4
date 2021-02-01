package com.qa.scanner;

public class Details {

	public void printVals(String username) {
		if (username.equals("root")) {
			System.out.println("Welcome");
		} else {
			System.out.println("wrong password");
		}
	}

	public int addTwo(String num1, String num2) {

		return Integer.parseInt(num1) + Integer.parseInt(num2);

	}

}
