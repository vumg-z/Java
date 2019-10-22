package com.Practica6Switchcase.app;
import java.util.Scanner;


public class SwichStatement {
	
	public static void main(String[] args) {
		
		//declaracion de variables
		int numeroMes = 0;
		String mes = "";
		char answer = 'y';
		
		//creacion de objeto
		Scanner input = new Scanner(System.in);
		
		do {
			
			numeroMes = 0;
			//validacion de datos
			
			while(numeroMes <= 0 || numeroMes > 12) { 
				
				//Ingresamos valores
				System.out.println("Ingresa un mes: ");
				
				numeroMes = input.nextInt();
				
				if(numeroMes <= 0 || numeroMes > 12) {
					System.out.println("Dato no valido");
				}
			}
			
			switch(numeroMes) {
			
			case 1: 
				mes = "Enero"; 
			break;
			
			case 2: 
				mes = "Febrero";
			break;
			
			case 3: 
				mes = "Marzo";
			break;
			
			case 4: 
				mes = "Abril";
			break;
			
			case 5: 
				mes = "Mayo";
			break;
			
			case 6: 
				mes = "Junio";
			break;
			
			case 7: 
				mes = "Julio";
			break;

			case 8: 
				mes = "Agosto";
			break;
			
			case 9: 
				mes = "Septiembre";
			break;
			
			case 10: 
				mes = "Octubre";
			break;
			
			case 11: 
				mes = "Noviembre";
			break;
			
			case 12: 
				mes = "Diciembre";
			break;
			
		
			}
			
			System.out.println("El mes es: "+mes);
			
			System.out.println("Desea agregar otro mes? y/n");
			
			answer = input.next().charAt(0);
			
			
		}while(answer == 'y');
		
		input.close();
	}

}
