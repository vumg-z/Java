package com.practica3algoritmos.app;
import java.util.Scanner;


public class TriangleArea {

	
	public static void main(String [] args) {
		
		// variables
		
		double base = 0.0;
		double altura = 0.0;
		double areaTriangulo = 0.0;
		
		Scanner keywordInput;
		keywordInput = new Scanner(System.in);
		
		
		//	imput
		
		System.out.println("Ingresa la base");
		
			base = keywordInput.nextDouble();
		
		System.out.println("Ingresa la altura");
		
			altura = keywordInput.nextDouble();
		
		//	process
			
		areaTriangulo = (base*altura)/2;
		
		//output
		
		System.out.println("El area es: "+areaTriangulo);
		
		
		keywordInput.close();
	}
	

	
}
