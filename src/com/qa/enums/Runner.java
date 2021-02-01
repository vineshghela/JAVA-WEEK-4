package com.qa.enums;

public class Runner {

	public static void main(String[] args) {
		int apples = 1234;
		double earthWeight = Double.parseDouble("175");
		double mass = earthWeight / Plannets.EARTH.surfaceGravity();
		System.out.println(mass);
		for (Plannets p : Plannets.values()) {
			System.out.printf("%d:your weight on %s is %f%n", apples, p, p.surfaceWeight(mass));
		}
	}

}
