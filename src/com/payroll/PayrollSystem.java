package com.payroll;

import java.util.ArrayList;
import java.util.Iterator;

public class PayrollSystem {
	
	public static double totalPayroll=0;
    public static void main(String []args){
    	 
    	Motorcycle bike= new Motorcycle("Ninja","Black","JOT",3000.0);
        Car car1= new Car("Wrangler","Black","JOT",43000.0,"6");
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Nayay", 1992, 40.0f,10.0f, 40,bike);   
        FixedBasedPartTime fixedBased=new FixedBasedPartTime("Sandeep Singh",1993,20.0f,9.0f,300,null);
        Intern intern=new Intern("Prabhjot Pannu",1994,"Lambton College",car1);
        FullTime fullTime=new FullTime("Aman Mann",1993,7200,1000,new Car("Range rover","Black","JOT",3000.0,"5"));
        //create an arraylist
        ArrayList<Employee> employeeArrayList= new ArrayList<>();
         employeeArrayList.add(commissionBasedPartTime);
         employeeArrayList.add(intern);
         employeeArrayList.add(fixedBased);
         employeeArrayList.add(fullTime);
         for (Employee e: employeeArrayList) {
         System.out.println("----------------------------------------------------------------------------- \n");
         System.out.println(e);
         totalPayroll=totalPayroll+e.calcEarnings();
         }
         System.out.println("\nTotal Payroll: "+totalPayroll+" Canadian Dollars");
         
         
    }
	



}
