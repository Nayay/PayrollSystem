package com.payroll;

public abstract class Employee {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int calcBirthYear(){
		return age;
		
	}
	public double calcEarnings(){
		return age;
		
	}
	
	

}
