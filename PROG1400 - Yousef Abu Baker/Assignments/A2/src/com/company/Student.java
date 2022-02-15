package com.company;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Double> mark = new ArrayList<Double>();

    public Student (String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMark(Double mark) {
        this.mark.add(mark);
    }

    public ArrayList<Double> getMark() {
        return mark;
    }
}
