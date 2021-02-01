package com.qa.generics;

// The T means we dont know the type
// we can take in any type - This is good!
public class Generics<T> {
//	private String carbrand;
	private T t;

//	getters
	public T get() {
		return this.t;
	}

//	setters
	public void set(T t1) {
		this.t = t1;
	}

	public static void main(String[] args) {
		Generics<String> type = new Generics<>();// with the type
		type.set("Vinesh");
		System.out.println(type.get());
		Generics<Integer> typeInt = new Generics<>();// with the type
		typeInt.set(100);
		System.out.println(typeInt.get());

		Generics<Boolean> typeBool = new Generics<>();// with the type
		typeBool.set(true);
		System.out.println(typeBool.get());

		Generics type1 = new Generics();// Raw type - no type in <>
		type1.set("String");
		System.out.println(type1.get());

		type1.set(10); // valid and autoboxing support
		System.out.println(type1.get());

	}

}
