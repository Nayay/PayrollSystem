package com.payroll;

public abstract class Employee implements IPrintable {
	private String name;
	private int age;
	private double earnings;



	public Employee(String name, int age) {
	        this.name=name;
	        this.age=age;
	    }
	 
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
	public double calcEarnings()
	{
		this.earnings=1000;
	return earnings;

	}
	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
	
	@Override
    public String printMyData() {
        return "Employee Name: "+getName()+"\n"+"Employee Age"+getAge();
    }

}
