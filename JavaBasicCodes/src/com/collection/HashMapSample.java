package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(100,"A");
		hs.put(101,"B");
		hs.put(null,"Alice");
		hs.put(231,"Bob");
		hs.put(123,"Chalie");
		hs.put(150,null);
		hs.put(null,null);
		
		for(Map.Entry<Integer, String> m : hs.entrySet()) {
			
			System.out.println(m.getKey()+":"+m.getValue());
			
		}
	

	}

}
