package com.payroll;



public abstract class Employee implements IPrintable {
	private String name;
	private int age;
	private Vehicle vehicle;
	
	 public Employee(String name, int age, Vehicle vehicle) {
	        this.name=name;
	        this.age=age;
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
	public int calcBirthYear(){
		return age;
		
	}
	public double calcEarnings(){
		return age;
		
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
