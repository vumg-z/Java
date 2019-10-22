package com.Practica7Array1D.app;

public class Array1D {
	public static void main(String[] args) {
		
		final int ELEMENTS_ARRAY = 10;
		
		// to ways to initialize variables
		
		int[] Array = new int[ELEMENTS_ARRAY];
		
		int[] Array2 = {1,2,3,3,4,5,6,7};
		
		char[] charArray = {'f','b','e','a','s','d'};
		
		
			for(int index = 0; index < Array2.length; index++) {
				System.out.println(Array2[index]);
			}
			
			for(int index = 0; index < charArray.length; index++) {
				System.out.println(charArray[index]);
			}
		
	
		}
 	
}
