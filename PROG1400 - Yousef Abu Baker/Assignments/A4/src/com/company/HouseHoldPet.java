package com.company;

import java.util.ArrayList;

public class HouseHoldPet {
    //Aggregation
    ArrayList<Cat> cats;
    ArrayList<Dog> dogs;

    public void setHouseHoldPet (ArrayList<Dog> dogs, ArrayList<Cat> cats) {
        this.cats=cats;
        this.dogs=dogs;
    }

}
