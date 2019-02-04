package com.payroll;

import java.util.ArrayList;

public class PayrollSystem {
	
	
    public static void main(String []args){
    	
    	 CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Nayay", 24, 20.0f,5.0f, 10);
    	 FixedBasedPartTime fixedBased=new FixedBasedPartTime("Jot",22,20.0f,9.0f,300);
    	 ArrayList<Employee> employeeArrayList= new ArrayList<>();
         employeeArrayList.add(commissionBasedPartTime);
         employeeArrayList.add(fixedBased);
         for (Employee e: employeeArrayList) {
       	  System.out.println(e);
         }

    }


}
