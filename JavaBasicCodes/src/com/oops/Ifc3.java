package com.oops;

public interface Ifc3 {
	public int mul(int i,int j);
	public int ifc_z=25;
	public default void test3() {
		System.out.println("Ifc3.test3()");		
	}
}
