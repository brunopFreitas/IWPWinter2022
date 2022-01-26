//Part 1
//        Using any Loop statements, print out the following shape:
//        The user will be prompted to enter how many numbers of asterisks as Follows
//        Welcome to theFirst Part!
//        Enter the number of asterisks:(Using keyboard input number of asterisks. E.g., 8)
//
//
//        ********
//        *******
//        ******
//        *****
//        ****
//        ***
//        **
//        *
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Welcome to the First Part!");
        System.out.print("Enter the number of asterisks: ");
        //Importing user prompt
        Scanner userInput = new Scanner(System.in);
        //Creating two variables to store the number of asterisks and the number of lines of the triangle.
        int numberOfAsterisks = userInput.nextInt();
        int numberOfLines = numberOfAsterisks;
        //Creating a variable that holds the symbol "*" of String type.
        String asterisk="*";
        //Iterating through numberOfLines printing * in descending order
        for(int i=0;i<numberOfLines;i++) {
            System.out.println(asterisk.repeat(numberOfAsterisks));
            numberOfAsterisks--;
        }
    }
}
