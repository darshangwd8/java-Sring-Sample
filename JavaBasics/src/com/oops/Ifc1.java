package com.oops;

public interface Ifc1 extends Ifc3 {
	public static final int ifc_x =5 ;// final keyword is optional(default)
 
	public abstract int add(int x, int y);// abstract keyword is optional(default)
    
    public default void test1() {
    	System.out.println("Ifc1.test1()");
    }
    public static void test2() {
    	System.out.println("Ifc1.test2()");
    }
	/*
	 * private void test3() {
	 * 
	 * }// JAVA 9 feacture
	 */
 }
