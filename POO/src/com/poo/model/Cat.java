package com.poo.model;

public class Cat {
	
	//variables
	private int edad = 0;
	private int id = 0;
	
	String nombre;
	
	//constructor vacio
	public Cat() {
		//vacio
	}
	
	//constructor 
	public Cat(int edad, int id, String nombre) {
		this.edad = edad;
		this.id = id;
		this.nombre = nombre;
	}
	
	
	//get and set ID
	
		// get id
		
		public int getId() {
			return id;
		}
		
		// set id
		
		public void setId(int id) {
			this.id = id;
		}
	
	//get and set NAME
		
			//get name
		
			public String getNombre() {
				return this.nombre;
			}
			
			//set name
			
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
	
	// get and set edad 
			
			//get edad
			
			public int getEdad() {
				return this.edad;
			}
			
			//set edad 
			
			public void setEdad(int edad) {
				this.edad = edad;
			}
			
}
