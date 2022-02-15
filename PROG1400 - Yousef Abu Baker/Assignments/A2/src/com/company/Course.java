package com.company;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> studentObject = new ArrayList<Student>();

    public Course (String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudentObject() {
        return studentObject;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setStudentObject(ArrayList<Student> studentObject) {
        this.studentObject = studentObject;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
