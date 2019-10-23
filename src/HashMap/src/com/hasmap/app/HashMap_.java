package com.hasmap.app;

import java.util.HashMap;

public class HashMap_ {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(0, "helio");
		map.put(1, "alex");
		map.put(2, "uriel");
		
		
		
		//funciones lambda
		map.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
		//
	}
}
