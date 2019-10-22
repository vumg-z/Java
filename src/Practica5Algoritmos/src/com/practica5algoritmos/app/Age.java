package com.practica5algoritmos.app;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		int age = 0;
		String messageToUser= "";
		
		//object
		
		Scanner input = new Scanner(System.in);
		
		//input
		
		System.out.println("ingresa la edad");
		
		age = input.nextInt();
		
		//process 
		

		if(age < 18) {
			messageToUser += "Eres menor de edad";
		}else if(age >= 18 ) {
			messageToUser += "Eres mayor de edad";
		}
		
		//output

		System.out.println(messageToUser);
		
		input.close();
	}

}
