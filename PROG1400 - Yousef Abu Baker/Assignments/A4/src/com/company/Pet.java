package com.company;

abstract public class Pet extends Animal{

    private String petName;
    private double petWeight;
    private int petAge;
    private String healthCondition;
    private boolean isVaccinated;

    public Pet (String petName, double petWeight, int petAge, String healthCondition, boolean isVaccinated) {
        this.petName=petName;
        this.petWeight=petWeight;
        this.petAge=petAge;
        this.healthCondition = healthCondition;
        this.isVaccinated = isVaccinated;
    }

// Method Override
    @Override
    public void setAnimalData(String petGender, String petDescription) {
        super.setAnimalGender(petGender);
        super.setAnimalDescription(petDescription);
    }

    public String getPetCompleteData() {
        return "+++++++++++++++++++++++++++" +
                "\npet Information: " +
                "\nName: " + petName +
                "\nGender: " + super.getAnimalGender() +
                "\nDescription: " + super.getAnimalDescription() +
                "\nAge: " + petAge +
                "\nWeight: " + petWeight +
                "\nIs it Vaccinated? " + isVaccinated +
                "\nHealth Condition: " + healthCondition +
                "\n+++++++++++++++++++++++++++";
    }
}
