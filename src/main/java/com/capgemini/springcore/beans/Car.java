package com.capgemini.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private int id;
	private String name;
	@Autowired
	private Engine engine;
	
	
	
	public void print() {
		engine.display();
		System.out.println("This is Car Class");
		System.out.println("ID is--->"+id);
		System.out.println("Name is--->"+name);
		
		
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
