package com.company;

public class Circle extends GeometryShape{

    static boolean isCircle = true;

    public Circle (double radius) {
        super(isCircle, radius);
    }

    public String getCircleInfo() {
        return "Your circle has " +
                super.getRadius() +
                " of radius.";
    }

    public String getCircleArea() {
        return super.getArea();
    }

    public boolean isCircle() {
        return isCircle;
    }
}
