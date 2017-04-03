package com.java.beans;

public class Person {
	
	private int id;
	private String name;
	private String nickname;
	
	
	public Person(int id, String name, String nickname) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
	}
	
	public Person(int id){
		this.id = id;
		
	}
	
	public Person (String nickname){
		this.nickname = nickname;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getNickname() {
		return nickname;
	}
	
	

}
