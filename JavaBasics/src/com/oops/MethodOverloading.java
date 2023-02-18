package com.oops;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.method("DARSHAN"));
	}
	public void method(int i) {
		System.out.println(" Hello 1");
	}
	public float method(int i,int j) {
		System.out.println(" Hello 1");
		return (float) (1.1);
	}
	public void method(float i,float j) {
		System.out.println(" Hello 1");
	}
	public void method(float i, int j) {
		System.out.println(" Hello 1");
	}
	public String method(String s) {
		System.out.println(5);
		return s;
	}

}
