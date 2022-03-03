package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] zoo = new Animal[3];
        zoo[0]=new Animal("Aligator", 550, "Swamp", false);
        zoo[1]=new Animal("Quokka", 10, "Outback", false);
        zoo[2]=new Animal("Arara", 4, "Rain Forest", false);

        for(int i=0;i<zoo.length;i++) {
            System.out.println(zoo[i].reportAnimal());
            System.out.println((zoo[i].feedAnAnimal("Noodle")));
            System.out.println((zoo[i].animalSound("Laugh")));
        }
    }
}
