package com.exceptions;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception5 e = new Exception5();
		try {
			e.ageValidation(14);
		} catch (IvalidAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("continuing the flow");

	}
	public void ageValidation(int age) throws IvalidAgeException {
		if(age<18) {
			throw new IvalidAgeException("Not Eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}

}
