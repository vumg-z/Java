package com.fibonacci.app;

public class FibonacciContadores {
	
	public static void main(String[] args) {
		//variables
		
		long numeroFibonacci = 1;
		int contador1 = 0;
		int contador2 = 1;
		
		for(int i = 0; i<100; i++) {
				System.out.print(numeroFibonacci+" ");
				numeroFibonacci = contador1 + contador2;
				contador1 = contador2;
				contador2 = (int) numeroFibonacci;
		}
		
	}
}
