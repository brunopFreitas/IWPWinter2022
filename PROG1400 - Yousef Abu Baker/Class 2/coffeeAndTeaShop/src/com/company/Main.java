package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scannerName = new Scanner(System.in);
        double cupValue = 1.25;
        double taxValue = 0.15;
        double cakeValue = 3.25;

        System.out.println("Welcome to the Coffee and Tea Shop");
        System.out.print("Enter the number of cups of coffee that you'd like to have: ");
        int numOfCups = scannerName.nextInt();
        System.out.println("The number of cups of coffee is: " + numOfCups);
        System.out.print("Enter the quantity of slices of cake you'd like to have: ");
        int slicesOfCake = scannerName.nextInt();
        System.out.println("The quantity of pieces of cake is: " + slicesOfCake);
        double pretax = (cupValue*numOfCups) + (cakeValue*slicesOfCake);
        System.out.println("Your pretax total is: " + pretax);
        double totalWithTax = pretax + (1+taxValue);
        System.out.println("Your final total after tax: " + totalWithTax);

    }
}
