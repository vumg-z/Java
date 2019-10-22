package com.excpections.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
		
	static public void main(String[] ayuwoki) {
		
		int[] v = new int[3];
		
		
		//creacion de objetos
		Scanner input = new Scanner(System.in);
		
		//leer datos
		
		for(int i = 0; i<v.length; i++) {
			try {
				v[i] = input.nextInt();	
			}catch(InputMismatchException e) {
				System.out.println("Ingresa un numero");
				i--;
				input.next();
			}
		}
		
		System.out.println(" ");
		
		for(int elemento: v) {
			System.out.println(elemento);
		}
	
		
	}
	
}
