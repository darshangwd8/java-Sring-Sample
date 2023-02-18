package com.oops;

public class Constructor {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Constructor a =new Constructor();
		Constructor b =new Constructor(1);
		Constructor c =new Constructor((float)1.1);
		Constructor d =new Constructor("Darshan");
	    Child p = new Child(); 	
		int x,y,z;
	}
	Constructor(){
		System.out.println("In Constructor.Constructor()");
	}
	Constructor(int x){
		this("Hi dude");
		System.out.println("In Constructor.Constructor() :" + x);
	}

	Constructor(float x){
		System.out.println("In Constructor.Constructor() :" + x);
	}
	Constructor(String x){
		System.out.println("In Constructor.Constructor() :" + x);
	}
}
class Child extends Constructor{
	Child(){
		super("Hello World");
		System.out.println("child.child()");
//		super("Hello World");
		//Constructor call must be the first statement in a constructor
	}
}
