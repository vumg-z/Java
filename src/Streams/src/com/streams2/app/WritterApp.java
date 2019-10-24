package com.streams2.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritterApp {
	public static void main(String[] dasd) {
		
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		
		
		
		try {
			
			myFile = new File("c:\\carpeta\\nota.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			myBuffer.write("Este es el comienzo de la historia, que gran momento de estar vivos...");
			
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
		
	

