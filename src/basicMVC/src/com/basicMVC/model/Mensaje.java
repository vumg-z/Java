package com.basicMVC.model;

public class Mensaje {
	private String texto;
	
	//constructores
	public Mensaje(String texto) {
		this.texto = texto;
	}
	
	//getters and setters
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
}
