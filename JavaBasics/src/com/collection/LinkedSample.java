package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al = new LinkedList<String>();
		al.add("Darshan");
		al.add("Hi");
		al.add("hello");
		al.add("hello");
		al.add("Hi");
		
		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
		System.out.println("******************************************");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
			
		}

	}

}
