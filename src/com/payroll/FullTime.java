package com.payroll;

public class FullTime extends Employee {
	private double salary;
	private double bonus;

	public FullTime(String name, int age, double salary,double bonus) {
		super(name, age);
		this.salary=salary;
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcEarnings(){
		return getSalary()+getBonus();
		//return salary+bonus
	}
	@Override
	public String printMyData() {
		return this.toString();
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name: ").append(getName()).append("\n").append("Age: ").append(getAge()).append("\n");
		stringBuilder.append("Employee is Working FullTime")
				.append("\n -Salary: ")
				.append(getSalary())
				.append("\n -Bonus: ")
				.append(getBonus())
				.append("\n -Earnings ")
				.append(calcEarnings())
				.append(" (").append(getSalary()).append(" + ").append(getBonus()).append(")");
		return String.valueOf(stringBuilder);
	}



}
