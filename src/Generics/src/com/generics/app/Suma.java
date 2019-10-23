package com.generics.app;

public class Suma <T> {
	
	T object;
	
	public Suma(T object) {
		this.object = object;
	}
	
	public T getObject() {
	 return this.object;
	}
	
	public static void main(String[] adsa) {
		Suma<Integer> suma = new Suma<Integer>(123);
		Suma<String>  suma2 = new Suma<String>("hola");
 	
	}
}


