package com.arraylist.com;

public class PlusMinus {


public class Solution {
	public void solution(/*int arr[]*/) { 
		
		
		int[] arr = new int[3];
		
		//codigo de abajo representa la solucion usando arr como argumento de la funcion
		double positive = 0;
        double negative = 0;
        double zero = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                //positivo
                positive++;
            }
            else if(arr[i] < 0){
                //negativo
                negative++;
            }else{
                //zero
                zero++;
            }
        }
        System.out.println(positive/arr.length);
        System.out.println(negative/arr.length);
        System.out.println(zero/arr.length);
	}
}

}
