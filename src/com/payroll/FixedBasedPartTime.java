package com.payroll;



public class FixedBasedPartTime extends PartTime {

   private double fixedAmount;
   private Vehicle vehicle;
   
   FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount,Vehicle vehicle) {
        super(name, age, rate, hoursWorked, vehicle);
        this.fixedAmount=fixedAmount;
        
    }
   
   public double getFixedAmount() {
      return fixedAmount;
   }

   public void setFixedAmount(double fixedAmount) {
      this.fixedAmount = fixedAmount;
   }

   @Override
   public double calcEarnings(){
       return (getRate() * getHoursWorked()) + getFixedAmount();
      
      //(rate*hoursWorked)+FixedAmount
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
    public String printMyData() {
        return super.printMyData();
    }
    @Override
       public String toString() {
           StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append("Name: " + getName() + "\n" + "Age: " + getAge() + "\n");
           
           stringBuilder.append("Employee is PartTime\\Fixed Amount")
                   .append("\n -Rate: " + getRate())
                   .append("\n -Hours Worked: " + getHoursWorked())
                   .append("\n -Fixed amount: " + getFixedAmount())
                   .append("\n -Earnings: " + calcEarnings())
                   .append("(" + getHoursWorked() * getRate() + " + " + getFixedAmount()+")"+"\n");
           checkVehicle(stringBuilder);
           return String.valueOf(stringBuilder);
       }
}