package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat firstPet = new Cat(
                "Garfield The Cat",
                6,
                4,
                "A very chubby cat",
                true,
                "male",
                "Yellow with black stripes and loves lasagna."
        );

        Cat secondPet = new Cat(
                "Salem Saberhagen",
                4,
                100,
                "Magical Cat",
                true,
                "male",
                "Salem is a black cat of unknown age. He is the companion of Sabrina the Witch."
        );

        Dog thirdPet = new Dog(
                "Jake the Dog",
                10,
                12,
                "Senior Dog",
                true,
                "male",
                "Jake is a magical dog, friend of Finn the Human."
        );

        Dog fourthPet = new Dog(
                "Scooby",
                12,
                8,
                "Always Hungry, love snacks.",
                true,
                "male",
                "Scooby is a brown dog with black spots who is afraid of ghosts."
        );

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(firstPet);
        cats.add(secondPet);
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(thirdPet);
        dogs.add(fourthPet);

        HouseHoldPet brunoHouse = new HouseHoldPet();
        brunoHouse.setHouseHoldPet(
                dogs,
                cats
        );

        brunoHouse.dogs.forEach((pet) -> {
            System.out.println(pet.getPetCompleteData());
            System.out.println(pet.play());
        });

        brunoHouse.cats.forEach((pet) -> {
            System.out.println(pet.getPetCompleteData());
            System.out.println(pet.play());
            String bodyRegion = "Belly";
            System.out.println(pet.scratchACat(bodyRegion));
            bodyRegion = "Tail Base";
            int intensity = 3;
            System.out.println(pet.scratchACat(bodyRegion,intensity));
            System.out.println(pet.scratchACat("Belly",4));
            System.out.println(pet.scratchACat("Head"));
        });
    }
}
