package com.Practica7Array1D.app;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		
		// Constants declarations
		
		final int ELEMENTS_ARRAY = 10;
		
		// Variables 
		
		int generatedNumber = 0;
		byte generatedNumberByte = 0;
		
		
		// Array declaration
		
		int[] Array = new int[ELEMENTS_ARRAY];
		
		// Array pseudo random numbers 
		// Way 1 By means of random class
		
		Random randomNumbers = new Random(System.nanoTime());
		
		// Los numeros pseudo aleatorios se generan de 0 a 1 en todas las funciones, si queremos
		// que genere numero del 1 al 10 tenemos que multiplicar por 10
		
		for(int i = 0; i<=ELEMENTS_ARRAY; i++) {
			generatedNumber = randomNumbers.nextInt(51)+50;  //un numero aleatorio entre 50 a 100
			System.out.println(generatedNumber);
		}
		
		// otro ejemplo 
		// segunda forma de hacer un numero aleatorio
		
		for(int i = 0; i<=ELEMENTS_ARRAY; i++) {
			generatedNumber = (int) (Math.random()*51+50);
			
			System.out.println(generatedNumber);
			
		}
		
		System.out.println(" ");
		
			
		for(int i = 0; i<ELEMENTS_ARRAY; i++) {
			generatedNumberByte = (byte) randomNumbers.nextInt(101);
			System.out.println(generatedNumberByte);
		}
		

	}
}
