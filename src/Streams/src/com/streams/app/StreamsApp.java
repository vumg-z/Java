package com.streams.app;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class StreamsApp {
	public static void main(String[] arasd) {
		
		File myFile = null;
		FileReader myReader = null;
		BufferedReader myBuffer = null;
		
		String line = "";
		
		try {
			
			myFile = new File("c:\\carpeta\\nota.txt");
			myReader = new FileReader(myFile);
			myBuffer = new BufferedReader(myReader);
			
			
			
			//imprimir todas las lineas
			while((line = myBuffer.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				myBuffer.close();
				myReader = null;
				myFile = null;
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
