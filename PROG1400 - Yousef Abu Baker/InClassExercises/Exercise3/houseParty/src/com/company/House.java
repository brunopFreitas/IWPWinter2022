package com.company;

public class House {
    double length;
    double width;
    int bedroom;
    int bathroom;

    public House(double length, double width, int bedroom, int bathroom) {
        this.length=length;
        this.width=width;
        this.bedroom=bedroom;
        this.bathroom=bathroom;
    }

    public double printTotalArea() {
        return this.length*this.width;
    }

    public String houseDescription() {
        String houseDescription = "This house has: "
                + this.length
                + "m of length and "
                + this.width
                + "m of width."
                + " It contains "
                + this.bedroom
                + " bedrooms and "
                + this.bathroom
                + " bathrooms.";
        return houseDescription;
    }
}

