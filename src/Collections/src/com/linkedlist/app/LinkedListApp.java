package com.linkedlist.app;

import java.util.LinkedList;

public class LinkedListApp {
	public static void main(String[] a) {
		
		LinkedList<Byte> nuevaLista = new LinkedList<Byte>();
		
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
				
	}
}
