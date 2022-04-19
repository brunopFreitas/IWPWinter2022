package com.company;

public class Dog extends Pet{

    public Dog(String petName, double petWeight, int petAge, String healthCondition, boolean isVaccinated, String petGender, String petDescription) {
        super(petName, petWeight, petAge, healthCondition, isVaccinated);
        super.setAnimalGender(petGender);
        super.setAnimalDescription(petDescription);
    }

//    Polymorphism and Method Override
    @Override
    public String play() {
        return "Dogs are dumb, they play with anything and anyone.";
    }
}
