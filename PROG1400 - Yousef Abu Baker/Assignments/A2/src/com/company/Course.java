package com.company;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> student = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void insertStudent(String studentName, double assignmentOneMark, double assignmentTwoMark) {
        student.add(new Student(studentName, assignmentOneMark, assignmentTwoMark));
    }

    public ArrayList<Student> getStudentObject() {
        return student;
    }


}
