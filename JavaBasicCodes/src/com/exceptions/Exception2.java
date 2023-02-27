package com.exceptions;

public class Exception2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int i = 5;
		String s = null;
		try {
			System.out.println(s.length());
			i=5/0;
			System.out.println(i);
		}catch(NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		finally {
			System.out.println("Thank you");
		}
	}

}
