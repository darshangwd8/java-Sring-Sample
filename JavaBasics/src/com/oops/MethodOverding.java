package com.oops;

public class MethodOverding extends SuperRiding{
	public static void main(String[] args) {
		MethodOverding m =  new MethodOverding();
		m.msg();
	}
	public void msg() {
		System.out.println("Running from MethodOveriding");
		super.msg();
	}

	
}
class SuperRiding{
	public void msg() {
		System.out.println("Running from SuperRidding");	
	}
}
