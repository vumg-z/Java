package com.practica4algoritmos.app;
import java.util.Scanner;

public class areaCircle {

	public static void main(String[] args) {
		
		//constants declarations
		
		final double NUMERO_PI = 3.1416;
		
		//variable
		
		double radio = 0;
		double area = 0;
		
		//objeto
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el radio: ");
		radio = input.nextDouble();
		
		//process
		
		area = NUMERO_PI*(radio*radio);
		
		
		//output
		
		System.out.println("El area es: "+area);
		
		input.close();
		

	}

}
