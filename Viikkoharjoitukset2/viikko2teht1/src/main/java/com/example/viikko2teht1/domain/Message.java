package com.example.viikko2teht1.domain;

public class Message {
	private long age;

	private String name;
	
	public long getAge() {
		return age;
	}
	public void setAge(long id) {
		this.age = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String msg) {
		this.name = msg;
	}
	
	@Override
	public String toString() {
		return "Message [msg=" + name + "]";
	}
}