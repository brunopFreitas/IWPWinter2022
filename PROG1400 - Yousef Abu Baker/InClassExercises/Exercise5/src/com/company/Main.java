package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Circle> circles = new ArrayList<>();
        System.out.println("PROG1400 - Exercise 5");
        circles.add(new Circle());
        circles.add(new Circle(4.5));
        circles.add(new Circle("Red", 3.6));

        System.out.println("Let's test our circles");
        for (int i=0;i<circles.size();i++) {
            System.out.println("Testing object number " + (i+1));
            System.out.println(circles.get(i).toString());
            System.out.println(circles.get(i).getCircleArea());
        }
        System.out.println("Bruno Freitas - W0448225");
    }
}
