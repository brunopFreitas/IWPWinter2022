package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("PROG1400 - Exercise 4");
        ArrayList<Food> picnicBasket = new ArrayList<>();

        picnicBasket.add(new Food("Chicken Leg", "Meat"));
        picnicBasket.add(new Food("Apple", "Fruit"));
        picnicBasket.add(new Food("Chips", "Snack"));

        for(int i=0;i<picnicBasket.size();i++) {
            System.out.println("Let's see what is inside this basket...");
            System.out.println("I've found " + picnicBasket.get(i).getName());
            System.out.println("Type is " + picnicBasket.get(i).getType());
            if(picnicBasket.get(i).getType()=="Meat") {
                System.out.println(picnicBasket.get(i).iDontLikeThis());
            } else {
                System.out.println(picnicBasket.get(i).whatHaveIEaten());
            }
        }
        System.out.println("Bruno Freitas - W0448225");
    }
}
