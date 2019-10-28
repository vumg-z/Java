package com.arraylist.com;

public class MiniMaxSum {
	public static void main(String[] asdsa) {
		
		int[] vector = new int[5];
		
		int max = 0;
		int min = 0;
		int resultado = 0;
		
		for(int i = 0; i<vector.length; i++)
			vector[i] = i+1;
		
		for(int i = 0; i<vector.length; i++) {
			resultado = 0;
			for(int j = 0; j<vector.length; j++) {
				resultado += vector[j];
			}
		}
		
	
		
		for(int i = 0; i<vector.length; i++)
			System.out.print(vector[i]);
		
		System.out.print(" "+resultado);
		
		
		
		
	}
}
