package com.company;

abstract public class GeometryShape {
    private double length;
    private double height;
    private boolean isCircle=false;
    private double radius;

    public GeometryShape(double length, double height) {
        this.length=length;
        this.height=height;
    }

    public GeometryShape(boolean isCircle, double radius) {
        this.isCircle = isCircle;
        this.radius=radius;
    }

    public String getArea() {
        if(!this.isCircle) {
            return "The area of your object is " + (this.length*this.height);
        } else {
            return "The area of your object is " + (Math.PI*Math.pow(this.radius, 2));
        }
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public boolean isCircle() {
        return isCircle;
    }

    public double getRadius() {
        return radius;
    }
}
