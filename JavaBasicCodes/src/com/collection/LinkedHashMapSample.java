package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hs = new LinkedHashMap<>();
		hs.put(100,"A");
		hs.put(101,"B");
		hs.put(null,"Alice");
		hs.put(231,"Bob");
		hs.put(123,"Chalie");
		hs.put(150,null);
		hs.put(null,null);// rewrites null,Alice
		
		for(Map.Entry<Integer, String> m : hs.entrySet()) {
			
			System.out.println(m.getKey()+":"+m.getValue());
			
		}

	}
	

}
