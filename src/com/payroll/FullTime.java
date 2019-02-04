package com.payroll;

import com.payroll.Vehicle;



public class FullTime extends Employee {
	private double salary;
	private double bonus;
	 private Vehicle vehicle;
	
	 public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public FullTime(String name, int age, double salary,double bonus,Vehicle vehicle) {
		super(name, age,vehicle);
		this.salary=salary;
		this.bonus=bonus;
		 setVehicle(vehicle);		// TODO Auto-generated constructor stub
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

	
	//Vehicle block

    private void checkVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Employee has no vehicle registerd");
        } else if (vehicle instanceof Car) {
            stringBuilder.append("Employee has a Car\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Distance Travelled: ").append(((Car)getVehicle()).getDistanceTravelled())
                    .append("\n -Capacity: ").append(((Car)getVehicle()).getCapacity());
                    
        	} else if (vehicle instanceof Motorcycle) {
            stringBuilder.append("Employee has a MotorCycle\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Distance Travelled: ").append(((Motorcycle)getVehicle()).getDistanceTravelled())
                    ;
        }
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
				.append(" (").append(getSalary()).append(" + ").append(getBonus()).append(")"+ "\n");
		
		checkVehicle(stringBuilder);
		return String.valueOf(stringBuilder);
	}



}
