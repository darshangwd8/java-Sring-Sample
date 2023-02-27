package com.thread;

public class SyncSample {

	public static void main(String[] args) {
		Table t = new Table();
		Thread t1=new Thread(new Thread1(t));
		Thread t2=new Thread(new Thread2(t));
		t1.start();
		t2.start();
	}

}
class Table {
	synchronized public void printTable(int n) throws InterruptedException {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" * "+n+" = "+(i*n));
			Thread.sleep(1000);
		}
	}
	
}

class Thread1 implements Runnable{
	Table t;
	public Thread1(Table t) {
		super();
		this.t=t;
	}
	public void run() {
		try {
			t.printTable(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
class Thread2 implements Runnable{
	Table t;
	public Thread2(Table t) {
		super();
		this.t=t;
	}
	public void run() {
		try {
			t.printTable(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}