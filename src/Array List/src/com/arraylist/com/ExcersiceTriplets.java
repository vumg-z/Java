package com.arraylist.com;

import java.util.ArrayList;
import java.util.List;

public class ExcersiceTriplets {
	
	 // Complete the compareTriplets function below.
   
	public static void main(String[] pepe) {
		//declaracion de variables
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		List<Integer> resultados = new ArrayList<Integer>();
		
		int one = 0, two = 0;
		
		a.add(17);
		a.add(28);
		a.add(30);
		
		
		b.add(99);
		b.add(16);
		b.add(8);
	
		
		for(int i = 0; i<a.size(); i++) {
			if(a.get(i) > b.get(i))
				one++;
			else if(a.get(i) < b.get(i))
				two++;
		}
		
		resultados.add(one);
		resultados.add(two);
		
		
	}
	
	
}
