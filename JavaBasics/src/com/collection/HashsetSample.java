package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> al=new HashSet<String>();
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
