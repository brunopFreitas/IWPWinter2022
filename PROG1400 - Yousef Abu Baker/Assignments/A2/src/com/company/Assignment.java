package com.company;

import java.util.ArrayList;

public class Assignment {
    private String assignmentName;
    private Student student;
    private ArrayList<Double> mark = new ArrayList<Double>();

    public Assignment (String assignmentName) {
        this.assignmentName=assignmentName;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public void setMark(Double mark) {
        this.student = student;
        if(mark>=0 || mark<=20) {
            this.mark.add(mark);
        }
    }

    public ArrayList<Double> getMark() {
        return mark;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
