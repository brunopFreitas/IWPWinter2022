package com.company;

public class Animal {

    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;


    public Animal () {
        this.species="Domestic Cat";
        this.maxWeight=4;
        this.habitat="A house";
        this.isEndangered=false;
    }

    public Animal (String species, double maxWeight, String habitat, boolean isEndangered) {
        this.species=species;
        this.maxWeight=maxWeight;
        this.habitat=habitat;
        this.isEndangered=isEndangered;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String getSpecies() {
        return this.species;
    }

    public double getMaxWeight() {
        return this.maxWeight;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public boolean getIsEndangered () {
        return this.isEndangered;
    }

    public String reportAnimal () {
        String endangered;
        if(this.getIsEndangered()) {
            endangered = "I am an endangered species.";
        } else {
            endangered = "I am not an endangered species.";
        }
        return "I am a "
                + this.getMaxWeight()
                + "Kg "
                + this.getSpecies()
                + " "
                + "that lives in "
                + this.getHabitat()
                + ". "
                + endangered;
    }

    public String feedAnAnimal (String food) {
        return "I`m feeding a " + this.getSpecies() + " with " + food;
    }

    public String animalSound(String sound) {
        return "A " + this.getSpecies() + " can " + sound;
    }




}
