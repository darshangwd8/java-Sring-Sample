package com.lambdaExpresion;
@FunctionalInterface
interface sayable{
	public String say(String name);
}

interface addable{
	public int add(int a,int b);
}

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayable sa = (name) ->{
			return "hello"+name;
		};
		
		addable ad =(a, b) -> { return a+b; };
		 
		addable ad1 =(a, b) ->(a+b);//Lambda one line Expression
		
		addable ad2=(a, b) -> {
			System.out.println(a+" + "+ b);
			return a+b;
		};
		
		System.out.println(sa.say("DARSHAN"));
		System.out.println("5 + 6 = "+ad.add(5, 6));
		System.out.println(ad1.add(5, 6));
		System.out.println(ad2.add(10, 5));
	}

}
