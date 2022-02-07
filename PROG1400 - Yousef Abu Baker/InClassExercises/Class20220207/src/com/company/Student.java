package com.company;

public class Student {

    public String stdName;
    public double firstAssignment;
    public double secondAssignment;
    public double totalMarks;
    public double courseAverage;


    //Constructor
    public Student(String stdName, double firstAssignment, double secondAssignment) {
        this.stdName = stdName;
        this.firstAssignment = firstAssignment;
        this.secondAssignment = secondAssignment;
        totalMarks = firstAssignment+secondAssignment;
        courseAverage = (totalMarks/2);
    }

    public void showMarks() {
        System.out.println("Student " + this.stdName + "-" + this.firstAssignment + "-" + this.secondAssignment + ". The total is: " + this.totalMarks + " and the Average is: " + this.courseAverage);
    }

}
