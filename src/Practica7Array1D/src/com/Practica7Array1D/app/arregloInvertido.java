package com.Practica7Array1D.app;

import java.util.Random;

public class arregloInvertido {
	public static void main(String[] args) {
		//declaracion de variables
		
		int[] arreglo = new int[10];
		int[] arregloInvertido = new int[10];
		
		//creacion de objetos
		
		Random randomNumber = new Random(System.nanoTime());
		
		//este for se encarga de llenar el arreglo de 10 numeros aleatorios
		for(int i = 0; i<arreglo.length; i++) {
			arreglo[i] = randomNumber.nextInt(11);
			System.out.print(arreglo[i]+" ");
		}
		
		//Esta linea separa el arreglo invertido del no invertido
		System.out.println("");
		
		//proceso
		
		int j = 9;
		
		for(int i = 0; i < 10; i++) {
			arregloInvertido[j] = arreglo[i];
			j--;
		}
		
		// output
		
		for(int i = 0; i<arreglo.length; i++) {
			System.out.print(arregloInvertido[i]+" ");
		}
		
		
	}
}
