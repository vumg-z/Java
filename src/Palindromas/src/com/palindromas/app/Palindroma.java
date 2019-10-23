package com.palindromas.app;

import java.util.Stack;

public class Palindroma {
	public static void main(String[] argp) {
		
		boolean isPalindroma = false;
		
		String cadena = "Anita lava la tina.";		
		
		System.out.println(Palindroma.isPalindromoStack(cadena));
		
	}
	
	public static boolean isPalindromo(String cadena) { 

		
		boolean isPalindromo = true;
		String cadenaLimpia = "";
		
		cadenaLimpia = cadena.replace(" ", "");
		cadenaLimpia = cadenaLimpia.toLowerCase();
		cadenaLimpia = cadenaLimpia.replace(",", "");
		cadenaLimpia = cadenaLimpia.replace(".", "");
		
		
		for(int i = 0; i<cadenaLimpia.length(); i++) {
			if(cadenaLimpia.charAt(i) != cadenaLimpia.charAt(cadenaLimpia.length()-1-i)) 
				isPalindromo = false;
		}
			
		return isPalindromo;
	}
	
	public static String isPalindromoStack(String cad) {
		
		boolean isPal=true;
		String cadClean=cad.replace(" ", "");
		cadClean = cadClean.replace(".","");
		cadClean = cadClean.replace(",","");
		cadClean = cadClean.replace("!","");
		cadClean = cadClean.toLowerCase();
		char[] cadArray = cadClean.toCharArray();
		Stack<Character> letters1 = new Stack<Character>();
		Stack<Character> letters2 = new Stack<Character>();

		for(Character c : cadArray)
		{
			letters1.push(c);
		}
		for(int i=cadArray.length-1;i>=0;i--)
		{
			letters2.push(cadArray[i]);
		}
		while(!letters1.isEmpty())
		{
			if(letters1.pop()!=letters2.pop())
			{
				isPal=false;
			}
		}
		if(isPal)
			return "Es Palindromo";
		else
			return "No es palindromo";
	}
}
