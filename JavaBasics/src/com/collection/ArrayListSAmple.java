package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSAmple {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Darshan");
		al.add("Hi");
		al.add("hello");
		al.add("hello");
		al.add("Hi");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Bob");
		al2.add("Alice");
		
		al.addAll(al2);
		
		System.out.println(al);
		Iterator<String> it =al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
