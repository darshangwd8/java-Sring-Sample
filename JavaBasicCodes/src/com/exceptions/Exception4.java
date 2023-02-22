package com.exceptions;

public class Exception4 {
	public static void main(String[] args) {
		int i=5;
		try {
			if(i==5) {
				throw new ArithmeticException();
			}
			else {
				System.out.println("Correct number");
			}
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("maintaining the flow of application");
	}

}
