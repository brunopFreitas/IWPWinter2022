package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    //Generate random marks
    static Double myMark() {
        Random number = new Random();
        double minMark = 0;
        double maxMark = 25;
        double mark = (minMark + (maxMark - minMark) * number.nextDouble());
        return mark;
    }

    public static void main(String[] args) {

	// write your code here
        ArrayList<Course> courseObject = new ArrayList<Course>();
        ArrayList<Student> studentObjectCourseOne = new ArrayList<Student>();
        ArrayList<Student> studentObjectCourseTwo = new ArrayList<Student>();
        Double total=0.0;

    //Course
        courseObject.add(new Course("Ruby on Rails"));
        courseObject.add(new Course("Swift"));

    //Student course one
        studentObjectCourseOne.add(new Student("Maja Eugraphios"));
        studentObjectCourseOne.add(new Student("Darragh Asena"));
        studentObjectCourseOne.add(new Student("Meshullam Hayati"));
        studentObjectCourseOne.add(new Student("Kshitij Fajra"));
        studentObjectCourseOne.add(new Student("Adad-Nirari Ilmari"));
        studentObjectCourseOne.add(new Student("Felipa Ankur"));

    //Student course two
        studentObjectCourseTwo.add(new Student("Tóki Monserrat"));
        studentObjectCourseTwo.add(new Student("Sofía Hina"));
        studentObjectCourseTwo.add(new Student("Gertrudis Sofija"));
        studentObjectCourseTwo.add(new Student("Inkeri Amund"));
        studentObjectCourseTwo.add(new Student("Martina Darnell"));
        studentObjectCourseTwo.add(new Student("Gian Luke"));

    //SetStudentToCourse
        courseObject.get(0).setStudentObject(studentObjectCourseOne);
        courseObject.get(1).setStudentObject(studentObjectCourseTwo);

    //Set student mark
        for(int i=0;i<studentObjectCourseOne.size();i++) {
            studentObjectCourseOne.get(i).setMark(myMark());
            studentObjectCourseTwo.get(i).setMark(myMark());
        }
    //Report 1
        System.out.println("This is Report 1");
        System.out.print("Total mars of Assignment 1 is: ");
        for(int i=0;i<courseObject.get(0).getStudentObject().size();i++) {
                total =+ courseObject.get(0).getStudentObject().get(i).getMark().get(0);
        }

        System.out.println(total);






    }


}
