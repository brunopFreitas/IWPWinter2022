package com.company;

public class Square extends GeometryShape{

    static boolean isLengthEqualToHeight = true;

    public Square(double length) {
        super(length, length);
    }

    public String getSquareInfo() {
        return "Each side of your square has " +
                super.getLength();
    }

    public String getSquareArea() {
        return super.getArea();
    }

    public boolean isLengthEqualToHeight() {
        return isLengthEqualToHeight;
    }
}
