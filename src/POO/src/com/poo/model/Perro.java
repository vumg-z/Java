package com.poo.model;

public class Perro {
	
	// por defecto es privado
	//declaracion de atributos
	private int id = 0;
	private int edad = 0;
	
	//constructor Perro
	
	public Perro(int id, int edad) {
		this.id = id;
		this.edad = edad;
	}
	
	//declaracion de metodos (este perro es muy listo)
	public void ladrar() {
		System.out.println("hola, tengo: "+this.edad+" wof"+" y mi id es: "+this.id);
	}
}
