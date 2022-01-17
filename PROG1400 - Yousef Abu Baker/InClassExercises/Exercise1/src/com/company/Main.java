package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to our store");
        System.out.print("Please enter the amount of your purchase: ");
        Scanner userPrompt = new Scanner(System.in);
        double purchaseAmount = userPrompt.nextDouble();
        if(purchaseAmount<50) {
            System.out.println("Purchases bellow $50 are subject to $10 shipment fee.");
            purchaseAmount+=10;
        } else {
            System.out.println("There's no shipping fee for this operation.");
        }
        System.out.printf("Your total purchase is: %.2f", purchaseAmount);
    }
}
