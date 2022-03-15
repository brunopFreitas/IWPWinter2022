package com.company;

public class Rectangle extends GeometryShape{

    static boolean isLengthDifferentFromHeight = true;

    public Rectangle(double length, double height) {
        super(length, height);
    }

    public String getRectangleInfo() {
        return "Your rectangle has " +
                super.getLength() +
                " of length, and " +
                super.getHeight() +
                " of height.";
    }

    public String getRectangleArea() {
        return super.getArea();
    }

    public boolean isLengthDifferentFromHeight() {
        return isLengthDifferentFromHeight;
    }
}
