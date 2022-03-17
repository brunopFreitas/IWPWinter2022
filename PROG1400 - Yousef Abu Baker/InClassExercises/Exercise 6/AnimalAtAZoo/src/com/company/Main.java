package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Animal mySnake = new Animal();
        Animal myPig = new Animal("Pig",250,"Farm",false);
        Animal myShark = new Animal("Shark",1200,"Ocean",true);
        System.out.println(myPig);
        System.out.println(mySnake.toString());
        System.out.println(myShark);

        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(mySnake);
        animalsList.add(myPig);
        animalsList.add(myShark);

        for (Animal myanimal:animalsList) {
            System.out.println(myanimal.makeSound());
            System.out.println(myanimal.feedAnimal());
            System.out.println(myanimal.toString());
        }

    }
}
