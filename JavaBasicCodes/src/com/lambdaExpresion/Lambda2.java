package com.lambdaExpresion;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("Alice");
		l.add("Bob");
		l.add("Charlie");
		
		l.forEach((n) -> System.out.println(n));
		

	}

}
