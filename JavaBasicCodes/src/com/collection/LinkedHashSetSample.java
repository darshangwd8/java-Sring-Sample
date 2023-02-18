package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> al = new LinkedHashSet<>();
		al.add("Darshan");
		al.add("Hi");
		al.add("hello");
		al.add("hello");
		al.add("Hi");
		
		Iterator<String> li = al.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
	}

}
