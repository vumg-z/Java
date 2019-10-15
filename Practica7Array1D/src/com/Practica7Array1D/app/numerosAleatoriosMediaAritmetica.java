package com.Practica7Array1D.app;

import java.util.Random;

public class numerosAleatoriosMediaAritmetica {
	public static void main(String[] args) {
		//declaracion de variables
		
		int[] arreglo = new int[10];
		int acumulador = 0;
		double mediaAritmetica = 0;
		
		//creacion de objetos
		
		Random randomNumber = new Random(System.nanoTime());
		
		//El primer for llena el arreglo de numeros aleatorios
		
		for(int i = 0; i<arreglo.length; i++) {
			arreglo[i] = randomNumber.nextInt(11);
		}
		
		//El segundo for se encarga de imprimir el arreglo completo
		
		for(int i = 0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		//El tercer for suma todos los numeros en el arreglo y los almacena en un acumulador
		
		for(int i = 0; i<arreglo.length; i++) {
			acumulador += arreglo[i];
		}
		
		//La media aritmética es la suma de todos los datos dividida entre el número total de datos.
		//O sea, la media aritmetica en este programa es el resultado de acumulador/entre el numero
		//total de datos (10)
		
		mediaAritmetica = acumulador/10;
		
		
		System.out.println("La media aritmetica de este arreglo de arriba es: "+mediaAritmetica);
		
	}
}
