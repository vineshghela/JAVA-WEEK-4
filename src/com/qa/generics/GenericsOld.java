package com.qa.generics;

// OLD WAY DONT DO ITTTTT
public class GenericsOld {

//	private String carbrand;
	private Object t;

//	getters
	public Object get() {
		return this.t;
	}

//	setters
	public void set(Object t1) {
		this.t = t1;
	}

	public static void main(String[] args) {
		GenericsOld type = new GenericsOld();
		type.set("James");
		String str = (String) type.get();
		System.out.println(str);

	}
}
