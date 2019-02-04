package com.payroll;

public class CommissionBasedPartTime extends PartTime {
	
	private double commissionPerc; 
	

    public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, double commissionPerc) {
        super(name, age, rate, hoursWorked);
        this.commissionPerc=commissionPerc;
    }

	
	public double getCommissionPerc() {
		return commissionPerc;
	}
	public void setCommissionPerc(double commissionPerc) {
		this.commissionPerc = commissionPerc;
	}
	
	
	public double calcEarnings(){
        double calculatedComission=0;

        if (commissionPerc!=0){
            double totalAmount=getRate()*getHoursWorked();
            calculatedComission=(getCommissionPerc()/100)*totalAmount;
        }
        return calculatedComission;
    }
	
	  @Override
	    public String printMyData() {
	        return this.toString();
	    }
	  @Override
	    public String toString() {
	        StringBuilder stringBuilder = new StringBuilder();
	        stringBuilder.append("Name: " + getName() + "\n" + "Age: " + getAge() + "\n");
	        stringBuilder.append("Employee is PartTime\\Comissioned")
	                .append("\n -Rate: " + getRate())
	                .append("\n -Hours Worked: " + getHoursWorked())
	                .append("\n -Comission: " + commissionPerc)
	                .append("\n -Earnings: " + calcEarnings())
	                .append("\n (" + getHoursWorked() * getRate() + " + " + getCommissionPerc() + "% of " + getHoursWorked() * getRate() + ")");
	        return String.valueOf(stringBuilder);

	    }
	    
	    


}
