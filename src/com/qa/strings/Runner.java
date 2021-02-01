package com.qa.strings;

public class Runner {
	// this is 1/7 ways we can do this.
	public static void main(String[] args) {
//                     
		String str1 = "SomeString";
		String str2 = "AnotherString";

		System.out.println(str1 + " " + str2);
		System.out.println(str1.equals(str2));// output: false!

		System.out.println(str1.length());// 10
		System.out.println(str1.toLowerCase());
		System.out.println(str1.charAt(0));
		System.out.println(str1.indexOf("S"));
		System.out.println(str1.endsWith("g"));// true
		System.out.println(str1.contains("me"));
		System.out.println(str1.toUpperCase());

		// start index - inclusive
		// end index - exclusive
		System.out.println(str1.substring(0, 4));
		System.out.println(str1.substring(0, 5));

		int votes[] = { 1, 5, 2, 1, 3 };

		for (int i = 0; i < votes.length; i++) {
			System.out.println(votes[i]);
		}

		for (int nums : votes) {
			System.out.println(nums);
		}

	}

}
