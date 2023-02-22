package com.exceptions;

public class Exception3 {
	public static void main(String[] args) {
		try {
			int i=20/0;
			System.out.println(i);
		}finally {
			System.out.println("Finally is always get executed");
		}
		System.out.println("Maintaining the flow of application");
	}

}
