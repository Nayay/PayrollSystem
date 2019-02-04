package com.payroll;

import com.payroll.Vehicle;

public abstract class PartTime extends Employee {
	private double rate;
	private float hoursWorked;
	//Add vehicle later
	public PartTime(String name, int age,float rate,float hoursWorked,Vehicle vehicle){
	        super(name,age,vehicle);
	        this.rate=rate;
	        this.hoursWorked=hoursWorked;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public float getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	 @Override
	    public String printMyData() {
	        return super.printMyData();
	    }

}
