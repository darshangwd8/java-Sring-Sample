package com.thread;

public class Banking {

	public static void main(String[] args) throws InterruptedException {
		customer c = new customer();
		Thread t1 = new Thread() {
			public void run() {
			  c.withdraw(15000);	
			}
		};
		Thread t2 = new Thread() {
			public void run() {
			  try {
				c.deposit(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
		};
		t1.start();
		Thread.sleep(10000);
		t2.start();
		

	}

}
class customer{
	public static int balance = 1000;
	synchronized void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("Low balance!!!!!!!!!!!!!!!!!");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance -=amount;
				System.out.println("withdraw completed");
			    
		}
	}
	synchronized void deposit(int amt) throws InterruptedException {
		System.out.println("Going to deposit");
		balance+=amt;
		System.out.println("Deposit Completed");
		Thread.sleep(10000);
		notify();
	}
}