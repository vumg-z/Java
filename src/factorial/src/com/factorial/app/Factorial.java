package com.factorial.app;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//el factorial de un entero positivo n, el factorial de n
		//es el producto de todos los numeros desde 1 hasta n.
		
		//declaracion de variables
		int numeroFactorial = 0;
		int producto = 1;
		
		//creacion objetos
		Scanner input = new Scanner(System.in);
		
		//pedirle al usuario los datos
		
		System.out.print("Ingresa el numero: ");
		numeroFactorial = input.nextInt();
		
		//proceso
		for(int i = 1; i<=numeroFactorial; i++) {
			producto *= i;
		}
		
		//output
		
		System.out.println("!"+numeroFactorial+": "+producto);
		
		//cerrar input
		input.close();
				
	}
}
