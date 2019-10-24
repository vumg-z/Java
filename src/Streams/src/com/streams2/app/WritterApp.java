package com.streams2.app;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritterApp {
	public static void main(String[] dasd) {
		
		//ejercicio: pedir una tabla al usuario y escribir en un archivo esa tabla hasta el numero 24
		
		
		//constantes
		int LIMIT = 24;
		
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		
		//nueva variable para mostrar las tablas
		int tabla = 0;
		
		//declaracion de objeto scanner
		Scanner input = new Scanner(System.in);
		
		
		
		try {
			
			myFile = new File("c:\\carpeta\\c.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			
			//leemos la tabla
			tabla = input.nextInt();
			for(int i = 0; i<LIMIT; i++) {
				System.out.println(tabla+" * "+i+" = "+i*tabla);
				myBuffer.write(String.format("%d X %d = %d %n", tabla,i,tabla*i));
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				myBuffer.close();
				myWriter = null;
				myFile = null;
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
		
	

