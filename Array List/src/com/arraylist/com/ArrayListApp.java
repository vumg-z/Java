package com.arraylist.com;

import java.util.ArrayList;

public class ArrayListApp {
	public static void main(String[] args){
		
		ArrayList<Short> nuevoArreglo = new  ArrayList<Short>();
		
			//salto de line
			System.out.println("");
				
			//agregamos valores al nuevo arreglo
			nuevoArreglo.add((short) 12);
			nuevoArreglo.add((short) 1);
			nuevoArreglo.add((short) 134);
				
			
			//imprimimos el nuevoArreglo
			for(Short element: nuevoArreglo) {
				System.out.print(element+" ");
			}
				
			//salto de line
			System.out.println("");
				
			//.contains()
			System.out.println("contiene numero el 12? "+nuevoArreglo.contains((short) 12));
				
	}
}
