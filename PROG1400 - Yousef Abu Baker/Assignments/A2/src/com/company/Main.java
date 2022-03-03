package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Variables
        ArrayList<Course> courses = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        String studentName;
        Double studentMark1=-1.0;
        Double studentMark2=-1.0;

        //Beginning
        System.out.println("IWP - PROG1700 - Assignment 2");
        System.out.println("Programming IT Courses");
        System.out.println("COURSE ENTRY");
        System.out.println("================================");

    //Get course
        System.out.println("Enter the name for course # 1: ");
        courses.add(new Course(userInput.nextLine()));
        System.out.println("Enter the name for course # 2: ");
        courses.add(new Course(userInput.nextLine()));
    //Get student and mark
        System.out.println("Student Entry");
        System.out.println("================================");
        for(int j=0;j<courses.size();j++) {
            System.out.println("Enter students for " + courses.get(j).getCourseName());
            for(int i=1;i<=6;i++) {
                System.out.println("Enter name for student # " + i + " :");
                userInput.nextLine();
                studentName = userInput.nextLine();
                while(studentMark1<0 || studentMark1>20) {
                    System.out.println("Enter Assignment1 mark for " + studentName);
                    studentMark1 = userInput.nextDouble();
                }
                while(studentMark1<0 || studentMark2>20) {
                    System.out.println("Enter Assignment2 mark for " + studentName);
                    studentMark2 = userInput.nextDouble();
                }
                courses.get(j).insertStudent(studentName,studentMark1,studentMark2);
                studentMark1=-1.0;
                studentMark2=-1.0;
            }
        }
    //Get Report
        System.out.println("REPORT: Stats per Course");
        System.out.println("================================");
        for(int j=0;j<courses.size();j++) {
            double totalAssignment1=0;
            double totalAssignment2=0;
            double totalAssignment;
            char rating='?';
            for(int i=0;i<courses.get(j).getStudentObject().size();i++) {
                totalAssignment1 += courses.get(j).getStudentObject().get(i).getMark1();
                totalAssignment2 += courses.get(j).getStudentObject().get(i).getMark2();
            }
            System.out.println(courses.get(j).getCourseName() + " : " + "Assignment 1 - " + totalAssignment1 + " Assignment 2 - " + totalAssignment2);
            totalAssignment = totalAssignment1+totalAssignment2;
            if(totalAssignment>=100) {
                rating='A';
            } else if (totalAssignment>=70&&totalAssignment<100) {
                rating='B';
            } else if (totalAssignment>=50&&totalAssignment<70) {
                rating='C';
            } else if (totalAssignment<50) {
                rating='F';
            }
            System.out.println("Total - " + totalAssignment + " Course Rating: " + rating);
        }
        System.out.println("REPORT: Stats per student");
        System.out.println("================================");
        for(int j=0;j<courses.size();j++) {
            double totalAssignment=0;
            System.out.println(courses.get(j).getCourseName());
            for(int i=0;i<courses.get(j).getStudentObject().size();i++) {
                System.out.println(
                        courses.get(j).getStudentObject().get(i).getStudentName()
                        + ": "
                        + "Assignment1 - "
                        + courses.get(j).getStudentObject().get(i).getMark1()
                        + " Assignment2 - "
                        + courses.get(j).getStudentObject().get(i).getMark2()
                );
                totalAssignment=courses.get(j).getStudentObject().get(i).getMark1()+courses.get(j).getStudentObject().get(i).getMark2();
                System.out.println("Total - " + totalAssignment);
            }
        }
    }
}
