package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("PROG1400 - Exercise 7");
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(6, 10);
        Circle circle = new Circle(3);

        System.out.println(square.getSquareInfo());
        System.out.println(square.getSquareArea());

        System.out.println(rectangle.getRectangleInfo());
        System.out.println(rectangle.getRectangleArea());

        System.out.println(circle.getCircleInfo());
        System.out.println(circle.getCircleArea());

        System.out.println("Bruno Freitas - W0448225");
    }
}
