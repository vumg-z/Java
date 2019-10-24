package com.assertions.app;

import java.util.Scanner;

public class AssertionsApp {
	public static void main(String[] args) {
		int edad = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("introduce tu edad");
		edad = input.nextInt();
		
		assert edad > 0: "edad no valida";
		
		if(edad<18)
			System.out.print("menor");
		else
			System.out.print("mayor");
	
	}
}
