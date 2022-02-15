package com.company;

import java.util.ArrayList;

public class ProgramTerm {
    private Student studentObject;
    private Course courseObject;
    private ArrayList<Double> assignmentMark = new ArrayList<Double>();

    public ProgramTerm(Student studentObject, Course courseObject) {
        this.studentObject = studentObject;
        this.courseObject = courseObject;
    }

    public Course getCourseObject() {
        return courseObject;
    }

    public Student getStudentObject() {
        return studentObject;
    }

    public ArrayList<Double> getAssignmentMark() {
        return assignmentMark;
    }

    public void setCourseObject(Course courseObject) {
        this.courseObject = courseObject;
    }

    public void setStudentObject(Student studentObject) {
        this.studentObject = studentObject;
    }

    public void setAssignmentMark(ArrayList<Double> assignmentMark) {
        this.assignmentMark = assignmentMark;
    }
}
