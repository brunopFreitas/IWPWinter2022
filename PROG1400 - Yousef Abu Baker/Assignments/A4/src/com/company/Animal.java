package com.company;

//Abstract Class
abstract public class Animal {
    private String animalGender;
    private String animalDescription;

    public String getAnimalGender() {
        return this.animalGender;
    };

    public String getAnimalDescription() {
        return this.animalDescription;
    };

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

//    Abstract method
    abstract public void setAnimalData(String petGender, String petDescription);

//    Override by subclass.
    public String play() {
        return "Each animal plays in a different way!";
    }
}
