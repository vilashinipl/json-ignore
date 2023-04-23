package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class joe2 {
	@JsonIgnore 
	private String name;
	private int id;
	private long age;
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "joe2 [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	

}
