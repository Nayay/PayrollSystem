package com.payroll;

public class CommissionBasedPartTime {
	
	private float commissionPerc; 
	public float getCommissionPerc() {
		return commissionPerc;
	}
	public void setCommissionPerc(float commissionPerc) {
		this.commissionPerc = commissionPerc;
	}
	public void calcEarnings() {
		//(rate*hoursWorked)+commission
	}

}
