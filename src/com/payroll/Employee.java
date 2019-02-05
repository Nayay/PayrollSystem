package com.payroll;

import java.time.LocalDate;

public abstract class Employee implements IPrintable {
	private String name;
	private int age;
	private Vehicle vehicle;
	private double earnings;
	
	
	
	 public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	public Employee(String name, int age, Vehicle vehicle) {
	        this.name=name;
	        this.age=calcBirthYear(age);
	        setVehicle(vehicle);
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
	//Calculate Birth Year
	public int calcBirthYear(int yearofBirth) {
		//yearofBirth=getAge();
		LocalDate end =  LocalDate.now();
		int age=Integer.valueOf(end.toString().substring(0, 4))  ; 
		age=age-yearofBirth-1;
		return age;
	}
	
	
	
	public double calcEarnings(){
	return this.earnings=1000;
		
	}
	 public Vehicle getVehicle() {
	        return vehicle;
	    }

	 public void setVehicle(Vehicle vehicle) {
	        this.vehicle = vehicle;
	   }
	
	@Override
    public String printMyData() {
        return "Employee Name: "+getName()+"\n"+"Employee Age"+getAge();
    }

}
