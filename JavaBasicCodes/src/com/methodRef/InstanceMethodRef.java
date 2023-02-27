package com.methodRef;

public class InstanceMethodRef {
	public static void main(String[] args) {
		InstanceMethodRef imr = new InstanceMethodRef();
		Payment1 p1 = imr :: debitpay;
		p1.pay();		
		Payment1 p2 = new InstanceMethodRef():: creditpay;
		p2.pay();
	}
	private void debitpay() {
		System.out.println("Paying through debit card");
	}
	public void creditpay() {
		System.out.println("Paying through credit card");

	}

}
@FunctionalInterface
interface Payment1{
	void pay();
}