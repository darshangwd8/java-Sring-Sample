package com.collection2;

import java.util.TreeSet;

public class ComparableSample {
	public static void main(String[] args) {
		TreeSet<User> obj1= new TreeSet<>();
		obj1.add(new User("DARSHAN"));
		obj1.add(new User("HI"));
		obj1.add(new User("Pello"));
		obj1.add(new User("Belcome"));
		obj1.add(new User("DARSHAN"));
		//System.out.println(obj1);
		
		for(User u:obj1) {
			System.out.println(u);
		}

	}
}
class User implements Comparable<User>{
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username) {
		// TODO Auto-generated constructor stub
		this.username=username;
	}
	@Override
	public int compareTo(User u) {
		// comparing and inserting
		return this.username.compareTo(u.username);
	}
	@Override
	public String toString() {
		return "Name:"+this.username;
	}
}