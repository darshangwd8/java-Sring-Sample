package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> al =new PriorityQueue<>();
		al.add("Darshan");
		al.add("Hi");
		al.add("pello");
		al.add("jello");
		al.add("Hit");
		
		System.out.println("head :"+al.element());// if empty NoSuchElement Exception
		System.out.println("head :"+al.peek());// returns if empty -> null
		
		Iterator<String> li = al.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
		al.remove();
		al.poll();
		System.out.println("after removing the elements");
		
		Iterator<String> li1 = al.iterator();
		while (li1.hasNext()) {
			System.out.println(li1.next());
			
		}
		
		
		
	}

}
