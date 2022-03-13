package com.company;

public class Animal {
	
    private String specie;
    private double maxWeight;
    private String habitat;
    private boolean isEmdangered;

    public Animal(){
        this.setSpecie("Snake");
        this.setMaxWeight(4);
        this.setHabitat("Forest");
        this.setEmdangered(true);
     }

    public Animal(String pSpecie, double pMaxWeight, String pHabitat, boolean pIsEndangered){
        this.setSpecie(pSpecie);
        this.setMaxWeight(pMaxWeight);
        this.setHabitat(pHabitat);
        this.setEmdangered(pIsEndangered);
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
            this.specie = specie;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEmdangered() {
        return isEmdangered;
    }

    public void setEmdangered(boolean emdangered) {
        isEmdangered = emdangered;
    }

    public String feedAnimal(){
        return "Feed a "+ this.specie + " a Steak";
    }
    public String makeSound(){

        return "A " + this.specie + " can moo";
    }
    public String toString(){
        String animalStatus = "Not Endangered";
        if (this.isEmdangered){
            animalStatus = "Endangered";
        }

        return String.format("I am a %.2f Ib %s that lives in the %s. I am %s specie.",
               this.maxWeight,this.specie,this.habitat,animalStatus );

    }










}
