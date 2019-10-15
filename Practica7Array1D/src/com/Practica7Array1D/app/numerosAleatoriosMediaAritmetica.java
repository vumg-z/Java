package com.Practica7Array1D.app;

import java.util.Random;

public class numerosAleatoriosMediaAritmetica {
	public static void main(String[] args) {
		//declaracion de variables
		
		int[] arreglo = new int[10];
		double acumulador = 0;
		
		Random randomNumber = new Random(System.nanoTime());
		
		for(int i = 0; i<arreglo.length; i++) {
			arreglo[i] = randomNumber.nextInt(11);
			System.out.println(arreglo[i]);
			acumulador += arreglo[i];
		}
		
		System.out.println("La media aritmetica de este arreglo de arriba es: "+acumulador/arreglo.length);
		
	}
}
