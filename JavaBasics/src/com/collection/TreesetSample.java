package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al=new TreeSet<>();
		al.add("Darshan");
		al.add("Hi");
		al.add("Zello");
		al.add("Zello");
		al.add("Hi");
		
		Iterator<String> li = al.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}

	}

}
