package com.methodRef;

public class StaticMethodRef {
	public static void main(String[] args) {
		Payment p = StaticMethodRef :: creditpay;
		p.pay();
		
	}
	public static void creditpay() {
		System.out.println("Paying through creadit card");
	}

}

interface Payment{
	void pay();
}
