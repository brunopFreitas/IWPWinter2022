package com.company;

public class Employee {

    private String employeeName;
    private boolean isFullTime;
    private String directManagerName;
    private double employeeSalary;

    public Employee () {
        this.employeeName = "New Employee";
        this. isFullTime = false;
        this.directManagerName = "Default Manager";
        this. employeeSalary = 50000.00;
    }

    public Employee (String employeeName, boolean isFullTime, String directManagerName, double employeeSalary) {
        this.employeeName = employeeName;
        this.isFullTime = isFullTime;
        this.directManagerName = directManagerName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public String getDirectManagerName() {
        return directManagerName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public void setDirectManagerName(String directManagerName) {
        this.directManagerName = directManagerName;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }


    public String getEmployeeReport() {
        return
                "I am " +
                this.employeeName +
                ", my annual salary is " +
                this.employeeSalary +
                ". My boss name is: " +
                this.directManagerName;
    }


}
