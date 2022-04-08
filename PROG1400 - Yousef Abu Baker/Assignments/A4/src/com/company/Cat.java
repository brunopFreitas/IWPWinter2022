package com.company;

//Inheritance
public class Cat extends Pet{

    public Cat(String petName, double petWeight, int petAge, String healthCondition, boolean isVaccinated, String petGender, String petDescription) {
        super(petName, petWeight, petAge, healthCondition, isVaccinated);
        super.setAnimalGender(petGender);
        super.setAnimalDescription(petDescription);
    }

//Method Overloading
    public String scratchACat (String bodyRegion) {
        if(bodyRegion=="Belly") {
            return "Cats does not like belly scratches.";
        } else {
            return "A " + bodyRegion + " scratch might be acceptable if there is trust.";
        }
    }

//Method Overloading
    public String scratchACat (String bodyRegion, int intensity) {
        if(bodyRegion=="Belly" && intensity > 3) {
            return "A belly scratch with intensity " + intensity +"? He will probably bite you.";
        } else if (bodyRegion=="Tail Base" && intensity <= 3){
            return "Cat likes base tail scratches";
        } else {
            return "A " + bodyRegion + " scratch with intensity " + intensity + " might be acceptable if there is trust.";
        }
    }

//    Polymorphism and Method Override
    @Override
    public String play() {
        return "Cats like chase and catch games.";
    }

}
