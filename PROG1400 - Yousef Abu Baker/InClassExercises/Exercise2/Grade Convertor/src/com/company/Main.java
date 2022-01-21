package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
         write your code here
        IWP - PROG1400 - In-Class Exercise 2
        Author: Bruno Freitas - W0448225
        */
        char[] letterGrades = {'A','B','C','D','F'};
        int[] numberGrades = {4,3,2,1,0};
        Scanner userPrompt = new Scanner(System.in);
        System.out.print("Please enter a grade: ");
        //I'm doing charAt(0) because the .next() method returns a string, and I only need a char.
        char userGrade = userPrompt.next().charAt(0);
        System.out.println(userGrade);
        for(int i=0;i<letterGrades.length;i++) {
            if(letterGrades[i] == userGrade) {
                System.out.println("The numeric grade for this input is: " + numberGrades[i]);
            }
        }
    }
}
