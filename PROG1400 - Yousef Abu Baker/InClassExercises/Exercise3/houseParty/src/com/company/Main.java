package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        House firstHouse = new House(9,10,3,2);
        House secondHouse = new House(4,6,1,1);
        House thirdHouse = new House(12,16,6,6);

        System.out.println("Welcome to In-Class Exercise 3: House Party");
        System.out.println("Let's print the description of each object");
        System.out.println("First house: " + firstHouse.houseDescription());
        System.out.println("Second house: " + secondHouse.houseDescription());
        System.out.println("Third house: " + thirdHouse.houseDescription());
        System.out.println("Let's print the area of each house");
        System.out.printf("First house: %.2fm²", firstHouse.printTotalArea());
        System.out.println();
        System.out.printf("Second house: %.2fm²", secondHouse.printTotalArea());
        System.out.println();
        System.out.printf("Third house: %.2fm²", thirdHouse.printTotalArea());

    }
}
