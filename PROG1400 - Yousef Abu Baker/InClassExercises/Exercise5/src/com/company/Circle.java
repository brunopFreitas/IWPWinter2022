package com.company;

public class Circle {

    private double radius;
    private String color;

    public Circle () {
        this.radius=2.0;
        this.color="Green";
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle (String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String getCircleArea() {
        return "The circle you created has an area of " + (Math.PI*Math.pow(this.radius, 2));
    }

    public String toString() {
        return "The circle you created have " +
                this.radius +
                " of radius and color " +
                this.color;
    }
}
