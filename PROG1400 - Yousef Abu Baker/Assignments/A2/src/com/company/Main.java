package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    //Generate random marks

    public static void main(String[] args) {
        System.out.println();

	// write your code here
        //Creating my variables
        ArrayList<Course> courseObject = new ArrayList<Course>();
        Scanner userInput = new Scanner(System.in);
        int courseQuantity;
        int studentQuantity;
        int assignmentQuantity;

        System.out.println("PROG1700");
        System.out.println("Assignment 2");
        System.out.println("##############################################################");
        System.out.print("Please inform how many Courses you are creating today: ");
        courseQuantity = userInput.nextInt();

    //Course
        for(int i=0;i<courseQuantity;i++) {
            System.out.print("Please inform the name of the course " + (i+1) + " : ");
            courseObject.add(new Course(userInput.next()));
        }

    //Student course
        System.out.println("##############################################################");
        System.out.print("Please inform how many Students per course: ");
        studentQuantity = userInput.nextInt();
        for(int j=0;j<courseObject.size();j++) {
            System.out.println("Enter students for " + courseObject.get(j).getCourseName());
            for(int i=0;i<studentQuantity;i++) {
                System.out.print("Enter name for student " + (i+1) + " : ");
                        courseObject.get(j).setStudent(userInput.next());
            }
        }

    //Set Assignments
        System.out.println("##############################################################");
        System.out.print("Please inform how many Assignments you are creating today: ");
        assignmentQuantity = userInput.nextInt();
        for(int j=0;j<assignmentQuantity;j++) {
            for(int i=0;i<assignmentQuantity;i++) {
                courseObject.get(j).createAssignment("Assignment " + (i+1));
            }
        }

    //Set student mark
        System.out.println("##############################################################");
        System.out.println("Let`s include some marks");
        for(int i=0;i<courseObject.size();i++) {
            System.out.println("Enter marks for " + courseObject.get(i).getCourseName());
            for(int j=0;j<courseObject.get(i).getAssignmentObject().size();j++) {
                System.out.println("Enter " + courseObject.get(i).getAssignmentObject().get(j).getAssignmentName() + " marks");
                for(int k=0;k<courseObject.get(i).getStudentObject().size();k++) {
                    System.out.print("Enter mark for " + courseObject.get(i).getStudentObject().get(k).getStudentName() + " : ");
                    courseObject.get(i).includeMark(courseObject.get(i).getAssignmentObject().get(j), courseObject.get(i).getStudentObject().get(k), userInput.nextDouble());
                }
            }
        }

        //Retrieve marks
        System.out.println("##############################################################");
        System.out.println("Printing marks");
        for(int i=0;i<courseObject.size();i++) {
            System.out.println("printing marks for " + courseObject.get(i).getCourseName());
            for(int j=0;j<courseObject.get(i).getAssignmentObject().size();j++) {
                System.out.println("Printing marks for " + courseObject.get(i).getAssignmentObject().get(j).getAssignmentName());
                for(int k=0;k<courseObject.get(i).getStudentObject().size();k++) {
                    System.out.print("Printing marks for " + courseObject.get(i).getStudentObject().get(k).getStudentName() + " : " + courseObject.get(i).retrieveMark(courseObject.get(i).getAssignmentObject().get(j), courseObject.get(i).getStudentObject().get(k)));
                }
            }
        }






    }


}
