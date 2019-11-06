package com.jstl.model;

public class Mensaje {
	private String saludo;
	
	public Mensaje(String saludo) {
		this.saludo = saludo;
	}
	
	//getters and setters
	
	public String getSaludo() {
		return this.saludo;
	}
	
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
