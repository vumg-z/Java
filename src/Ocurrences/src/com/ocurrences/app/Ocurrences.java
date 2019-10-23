package com.ocurrences.app;

import java.util.HashMap;
import java.util.Random;

public class Ocurrences {
	public static void main(String[] asd) {
		// Llenar un vector de 1000 elementos con numeros aleatorios de 0-100, despues
		// imprimir las occurrencias del 1 al 10 cada uno
		
		//declaracion de variables
		int[] myArray = new int[10];
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		int ocurrences = 0;
		
		//objects
		Random number = new Random(System.nanoTime());
		
		//llenamos el vector de numeros random comprendidos entre el 0 y el 100
		for(int i = 0; i<10; i++) {
			myArray[i] = number.nextInt(11);
		}
		
		for(int item: myArray) {
			ocurrences = 0;
			if(hashmap.containsKey(item)) {
				ocurrences = hashmap.get(item) + 1;
				hashmap.put(item,ocurrences);
			}
			hashmap.putIfAbsent(item, 1);
		}
		
		System.out.println(hashmap);
		
		
	}

}
