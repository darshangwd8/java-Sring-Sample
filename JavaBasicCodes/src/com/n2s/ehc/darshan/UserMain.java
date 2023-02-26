package com.n2s.ehc.darshan;

import java.util.Scanner;



public class UserMain {

	public static void main(String[] args)  {
		
		int ip=0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		
		do {
		
			menu();
			String s = input.nextLine();
			
			try {
				ip = Integer.valueOf(s);
			}catch(Exception e) {
				ip=6;
			}
			
			
			switch (ip) {
			case 1:
				
								
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			
			case 5:
				return;
				
			default:
				 try {
					throw new InvalidEntry();
				} catch (InvalidEntry e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}while(ip!=5);
			
	}
	
	private static void menu() {
		System.out.println("Choose the option below \n");
		System.out.println("***********************");
		System.out.printf(" 1 - Insert \n 2 - Update\n 3 - Delete\n 4 - View\n 5 - Exit \n");
		
	}
	

}
