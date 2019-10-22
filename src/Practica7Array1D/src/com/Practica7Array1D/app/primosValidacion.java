package com.Practica7Array1D.app;

import java.util.Scanner;

public class primosValidacion {
	public static void main(String[] args) {
		//variables
			int numerosPrimos = 0;
			int[] arregloPrimos = new int[10];
			boolean validacion = true;
			boolean isPrimo = true;
		
			
			
		//creacion de objeto
			Scanner input = new Scanner(System.in);
			
			
		// validacion .
			
			
			do {
				System.out.println("Escribe los numeros: ");
				
				for(int i = 0; i<10; i++) {
					validacion = true;
					arregloPrimos[i] = input.nextInt();
					
					if(arregloPrimos[i] <= 0) {
						System.out.println("Error");
						validacion = false;
						break;
					}
				}
				
			}while(validacion != true);
			
		// despues de la validacion vamos a hacer el proceso de numeros primos
			
			for(int i = 0; i < 	10; i++) {
				isPrimo = true;
				
				for(int j = 2; j < arregloPrimos[i]; j++) {
					if(arregloPrimos[i]%j == 0) {
						isPrimo = false;
						break;
					}
					if(isPrimo) {
						numerosPrimos++;	
					}
				}
				
			}
			
			System.out.println("La cantidad de numeros primos es: "+numerosPrimos);
			
	}
}
