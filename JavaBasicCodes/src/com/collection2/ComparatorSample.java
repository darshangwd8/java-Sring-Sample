package com.collection2;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSample {

	public static void main(String[] args) {
		TreeSet<Login> ts = new TreeSet<>(new UserNameCompare());
		ts.add(new Login("darshangwd","Apple"));
		ts.add(new Login("abcd","Hii"));
		ts.add(new Login("base","Hello"));
		ts.add(new Login("zippo","Welcome"));
		ts.add(new Login("darshangwd","Apple"));
		
		for(Login x:ts) {
			System.out.println(x);
		}
	}
}
class UserNameCompare implements Comparator<Login>{
	@Override
	public int compare(Login l1, Login l2) {
		// TODO Auto-generated method stub
		return l1.getUsername().compareTo(l2.getUsername());
	}
}
class Login{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : " + this.username +"\nPassword : "+this.password +"\n";
	}
}
