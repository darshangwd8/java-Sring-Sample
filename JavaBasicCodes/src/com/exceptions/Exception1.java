package com.exceptions;

public class Exception1 {
	public static void main(String[] args) {
		int i=10;
		try {
			i=20/0;
			System.out.println("i = "+i);	
		}
		catch (ArithmeticException e) {
			e.printStackTrace();			
		}
		finally {
			System.out.println("Thank you , Bye tata");
		}
    }

}
