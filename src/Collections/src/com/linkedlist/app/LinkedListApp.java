package com.linkedlist.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class LinkedListApp {
	public static void main(String[] a) {
		
		LinkedList<Byte> nuevaLista = new LinkedList<Byte>();

		ArrayList<Short> nuevoArreglo = new  ArrayList<Short>();
		
		Stack<Integer> pila = new Stack<Integer>();
		
		PriorityQueue<Double> cola = new PriorityQueue<Double>();
		
		HashMap<Integer, String> diccionario = new HashMap<Integer,String>();
		
		//agregamos elementos a nuevaLista usando add
		nuevaLista.add((byte) 1);
		nuevaLista.add((byte) 10);
		
		//eliminamos el elemento head con remove 
		nuevaLista.remove();
		
		//reemplazamos un elemento con set
		nuevaLista.set(0, (byte) 66);
		
		//obtenemos un elemento con get
		System.out.println(nuevaLista.get(0));
		
		//imprimimos la lista
		//System.out.println("lista: "+nuevaLista);
		
		//imprimimos el tamaño de la lista
		System.out.println("tamaño de la lista "+nuevaLista.size());
		
		//imprimimos si esta vacia o no 
		System.out.println("esta vacia?: "+nuevaLista.isEmpty());
		
		//imprimimos si contiene x numero
		System.out.println("lista contiene 66? "+nuevaLista.contains((byte)66));
		
		//	dos formas de iterar entre los nodos
		//  iterator
		//  for each
		
		//for each para imprimir la lista
		for(Byte elemento: nuevaLista) {
			System.out.println(elemento);
		}
		
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
