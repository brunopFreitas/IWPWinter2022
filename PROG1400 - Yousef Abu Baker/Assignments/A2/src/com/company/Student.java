package com.company;

public class Student {

    private String studentName;
    private double assignmentOneMark;
    private double assignmentTwoMark;

    public Student(String studentName, double assignmentOneMark, double assignmentTwoMark) {
        this.studentName = studentName;
        this.assignmentOneMark=assignmentOneMark;
        this.assignmentTwoMark=assignmentTwoMark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setMark1(double mark1) {
        this.assignmentOneMark = mark1;
    }

    public void setMark2(double mark2) {
        this.assignmentTwoMark = mark2;
    }

    public double getMark1() {
        return assignmentOneMark;
    }

    public double getMark2() {
        return assignmentTwoMark;
    }
}
