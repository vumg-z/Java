package com.fibonacci.app;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// La serie comienza con los numeros 0 y 1, y a partir de estos cada termino
		// es la suma de los dos anteriores. ejemplo: 
		
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 , 55, 89, 144, 233, 377, 610, 987, 1597
		
		//declaracion de variables
		
		int[] arreglo = new int[101];
		
		//la serie fibonacci empieza desde el 0,1
		arreglo[0] = 0;
		arreglo[1] = 1;
		
 		//proceso de llenar el arreglo con la serie de numeros fibonacci
		for(int i = 1; i<100; i++) {
			arreglo[i + 1] = arreglo[i - 1]+arreglo[i];
		}
		
		//imprimir el arreglo 
		for(int i = 1; i<100; i++) {
			System.out.print(arreglo[i]+" ");
		}
		

	}

}
