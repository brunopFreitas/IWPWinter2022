package com.company;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> studentObject = new ArrayList<Student>();
    private ArrayList<Assignment> assignmentObject = new ArrayList<Assignment>();

    public Course (String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudentObject() {
        return studentObject;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Assignment> getAssignmentObject() {
        return assignmentObject;
    }

    public void setStudent(String studentname) {
        studentObject.add(new Student(studentname));
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void createAssignment(String assignmentName) {
        assignmentObject.add(new Assignment(assignmentName));
    }

    public void includeMark(Assignment assignment, Student student, Double mark) {
        assignmentObject.get(assignmentObject.indexOf(assignment)).setStudent(student);
        assignmentObject.get(assignmentObject.indexOf(assignment)).setMark(mark);
    }

    public ArrayList<Double> retrieveMark(Assignment assignment, Student student) {
        return assignmentObject.get(assignmentObject.indexOf(assignment)).getMark();
    }

    public Student retrieveStudent(Assignment assignment) {
        return assignmentObject.get(assignmentObject.indexOf(assignment)).getStudent();
    }


}
