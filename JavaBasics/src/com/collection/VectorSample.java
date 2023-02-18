package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> al =new Vector<String>();
		al.add("Darshan");
		al.add("Hi");
		al.add("hello");
		al.add("hello");
		al.add("Hi");
		// Add element is only for Vectors
		al.addElement("Good Morning");
		
		Enumeration<String> e =al.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
