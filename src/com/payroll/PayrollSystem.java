package com.payroll;

import java.util.ArrayList;

public class PayrollSystem {
	
	
    public static void main(String []args){
    	 
    	 CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Nayay", 24, 40.0f,10.0f, 40);
    	 FixedBasedPartTime fixedBased=new FixedBasedPartTime("Jot",22,20.0f,9.0f,300);
    	 Intern intern=new Intern("Aman",21,"Lambton College");
    	 FullTime fullTime=new FullTime("Nayay",26,2200,1000);
    	 ArrayList<Employee> employeeArrayList= new ArrayList<>();
         employeeArrayList.add(commissionBasedPartTime);
         employeeArrayList.add(intern);
         employeeArrayList.add(fixedBased);
         employeeArrayList.add(fullTime);
         for (Employee e: employeeArrayList) {
          System.out.println("----------------------------------------------------------------------------- \n");
       	  System.out.println(e);
         }

    }


}
