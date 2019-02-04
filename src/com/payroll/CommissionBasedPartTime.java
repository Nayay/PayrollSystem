package com.payroll;

public class CommissionBasedPartTime extends PartTime {
	private double commissionPerc;
	private Vehicle vehicle;


	public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, double commissionPerc) {
		super(name, age, rate, hoursWorked);
		setcommissionPerc(commissionPerc);
	}

	@Override
	public double calcEarnings() {
		return (getRate() * getHoursWorked()) + calculateComission();
	}

	@Override
	public String printMyData() {
		return super.printMyData();
	}

	public double calculateComission(){
		double calculatedComission=0;

		if (commissionPerc!=0){
			double totalAmount=getRate()*getHoursWorked();
			calculatedComission=(getcommissionPerc()/100)*totalAmount;
		}
		return calculatedComission;
	}


	public double getcommissionPerc() {
		return commissionPerc;
	}

	public void setcommissionPerc(double commissionPerc) {
		if (commissionPerc > 0.0) {
			this.commissionPerc = commissionPerc;
		} else {
			throw new IllegalArgumentException("Commission rate must be >0");
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name: " + getName() + "\n" + "Year of Birth: " + getAge() + "\n");
		stringBuilder.append("Employee is PartTime/ Comissioned")
				.append("\n -Rate: " + getRate())
				.append("\n -Hours Worked: " + getHoursWorked())
				.append("\n -Comission: " + commissionPerc)
				.append("\n -Earnings: " + calcEarnings())
				.append("(" + getHoursWorked() * getRate() + " + " + getcommissionPerc() + "% of " + getHoursWorked() * getRate() + ")");
		return String.valueOf(stringBuilder);

	}




}
