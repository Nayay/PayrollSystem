package com.payroll;

public class Motorcycle extends Vehicle{
    private Double distanceTravelled;

    public Motorcycle(String make, String color, String plate,Double distanceTravelled) {
        super(make, color, plate);
        this.distanceTravelled=distanceTravelled;
        // TODO Auto-generated constructor stub
    }

    public Double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(Double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    

}
