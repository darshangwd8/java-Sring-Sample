package com.n2s.set1;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		try (
				
			Scanner Scanner = new Scanner(System.in)) {
			System.out.println("Enter a number between 1 to 100");
			int n = Scanner.nextInt();
			System.out.println("prime numbers are:");
			for(int num = 2; num <= n; num++) {

			    int i;

			    for(i = 2; i <= (num / 2); i++) {

			        if(num % i == 0) {
			            i = num;
			            break;
			        }
			    }

			    // If the number is prime then print it.
			    if(i != num) {
			        System.out.print(num + " ");
			    }
			}
		}
		

	}

}