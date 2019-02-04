package com.payroll;

public class Intern extends Employee {
    private String schoolName;
    private double earnings;
    private Vehicle vehicle;

    public Intern(String name, int age, String schoolName,Vehicle vehicle) {
        super(name, age, vehicle);
        this.schoolName = schoolName;
        // TODO Auto-generated constructor stub
    }


    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    @Override
    public String printMyData() {
        return "Employee Name " + getName() + "Age " + getAge() + "Intern School Name" + schoolName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + getName() + "\n" + "Age: " + getAge() + "\n");
        stringBuilder.append("Employee is Intern")
                .append("\n -School name: " + getSchoolName())
                .append("\n -Earnings: " + calcEarnings());
        return String.valueOf(stringBuilder);
    }

}