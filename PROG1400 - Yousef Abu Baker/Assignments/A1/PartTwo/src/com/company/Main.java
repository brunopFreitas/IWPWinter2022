//Part 2
//        Using Arrays, do the following:
//        Declare one dimensional array that represents 10 students’ marks.
//        Find out the total of all marks, average, minimum value, and maximum value.
//        Your Console should look like the following:
//
//        Welcome to the Second Part!
//        Enter the Student Marks:
//        Enter mark # 1  : 80.5
//        Enter mark # 2  : 90
//        Enter mark # 3  : 60
//        Enter mark # 4  : 67.5
//        Enter mark # 5  : 99
//        Enter mark # 6  : 75
//        Enter mark # 7  : 65.8
//        Enter mark # 8  : 98
//        Enter mark # 9  : 87
//        Enter mark # 10 : 82
//
//        Final Report:
//        The Total Marks: Show the result here
//        The Average : Show the result here (should be formatted number with one decimal digit only
//        The Maximum Value : Show the result here
//        The Minimum Value :Show the result here

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Second Part!");
        System.out.println("Enter the Student Marks: ");
        int numberOfMarks = 10;
        double [] studentMark = new double[numberOfMarks];
        double studentMarkTotal=0;
        double studentMarkAverage=0;
        double studentBiggestMark=0;
        double studentLowestMark=0;
        Scanner userInput = new Scanner(System.in);
        //Filling the array
        for(int i=0;i<numberOfMarks;i++) {
            System.out.print("Enter mark # " + (i+1) + ": ");
            studentMark[i]=userInput.nextDouble();
        }
        //Calculating the Total and finding the biggest and the lowest mark.
        for(int i=0;i<studentMark.length;i++) {
            //the total
            studentMarkTotal+=studentMark[i];
            //For first iteration both lowest and biggest marks will assume the first element
            if(i==0) {
                studentLowestMark=studentMark[i];
                studentBiggestMark=studentMark[i];
            }
            //Comparing the current element with the lowest one.
            if(studentMark[i]<studentLowestMark) {
                studentLowestMark=studentMark[i];
            }
            //Comparing the current element with the biggest one.
            if(studentMark[i]>studentBiggestMark) {
                studentBiggestMark=studentMark[i];
            }
        }
        //Calculating the average
        studentMarkAverage = (studentMarkTotal/numberOfMarks);
        //Printing everything
        System.out.println("Final report:");
        System.out.printf("The Total Marks: %.1f\n", studentMarkTotal);
        System.out.printf("The Average: %.1f\n", studentMarkAverage);
        System.out.printf("The Maximum Value: %.1f\n", studentBiggestMark);
        System.out.printf("The Minimum Value: %.1f\n", studentLowestMark);

    }
}
