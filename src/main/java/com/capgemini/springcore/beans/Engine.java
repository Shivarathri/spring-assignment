package com.capgemini.springcore.beans;

public class Engine {
	
	private int engNo;
	private String engName;
	
	public int getEngNo() {
		return engNo;
	}
	public void setEngNo(int engNo) {
		this.engNo = engNo;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	
	public void display() {
		System.out.println("This is Engine class");
		System.out.println("engNo is "+engNo);
		System.out.println("engName is "+engName);
	}
}
