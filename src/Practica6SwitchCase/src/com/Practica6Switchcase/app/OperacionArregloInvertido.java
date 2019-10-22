package com.Practica6Switchcase.app;

import java.util.Random;

public class OperacionArregloInvertido {
	public static void main(String[] args) {
		//declaracion de variables
		int [] arreglo = new int[10];
		int [] arregloSegundo = new int[10];
		int [] arregloResultado = new int[10];
		
		//creacion de objetos
		
		Random generatedNumber = new Random(System.nanoTime());
			
		//llenamos el primer arreglo de numeros aleatorios
		
		for(int i = 0; i<10; i++) {
			arreglo[i] = generatedNumber.nextInt(10);
		}
		
		//imprime el primer arreglo
		for(int i = 0; i<10; i++) {
			System.out.print(arreglo[i]+" ");
		}
		
		//salto de linea
		System.out.println("");
		
		//llenamos el segundo arreglo de numeros aleatorios
		
		for(int i = 0; i<10; i++) {
			arregloSegundo[i] = generatedNumber.nextInt(10);
		}
		
		//imprime el segundo arreglo
		for(int i = 0; i<10; i++) {
			System.out.print(arregloSegundo[i]+" ");
		}
		
		//salto de linea
		System.out.println("");
		
		//proceso
		for(int i =0, j = 9; i<10; i++) {
			arregloResultado[i] = arreglo[i] + arregloSegundo[j];
			j--;
		}
	
		//salto de linea
		System.out.println("");
		
		//imprime el tercer arreglo resultado
 		for(int i = 0; i<10; i++) {
			System.out.print(arregloResultado[i]+" ");
		}
		
	}
}
