package com.payroll;

public class CommissionBasedPartTime extends PartTime {
	private double commissionPerc;
	private Vehicle vehicle;


	public double getCommissionPerc() {
		return commissionPerc;
	}

	public void setCommissionPerc(double commissionPerc) {
		this.commissionPerc = commissionPerc;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, double commissionPerc,Vehicle vehicle) {
		super(name, age, rate, hoursWorked, vehicle);
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
			throw new IllegalArgumentException("Commission rate must be greater than zero");
		}
	}
	
	
	//Vehicle block

    private void checkVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Employee has no Vehicle Registerd");
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
                    .append("\n -Distance Travelled: ").append(((Motorcycle)getVehicle()).getDistanceTravelled());
        }
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
				.append("(" + getHoursWorked() * getRate() + " + " + getcommissionPerc() + "% of " + getHoursWorked() * getRate() + ")"+"\n");
		checkVehicle(stringBuilder);
		return String.valueOf(stringBuilder);

	}




}
