package org.example;

import org.example.zoo.Animal;
import org.example.zoo.Owner;
import org.example.zoo.Species;

public class Main {
    public static void main(String[] args) {
        Species husky = new Species("husky",500);
        Species tiger = new Species("tiger", 1000);
        Species elephant = new Species("elephant", 1000);
        Species monkey = new Species("monkey", 300);

        //task 1
        Animal animal1 = new Animal("a1", "Bello", husky, 3);
        Animal animal12 = new Animal("a2", "Bella", husky, 5);
        Animal animal2 = new Animal("b2", "Tiggy", tiger, 5);
        Animal animal21 = new Animal("b3", "Tigto", tiger, 4);
        Animal animal3 = new Animal("c3", "Ellie", elephant, 10);
        Animal animal31 = new Animal("c4", "Ello", elephant, 15);
        Animal animal4 = new Animal("d4", "Momo", monkey, 3);
        Animal animal6 = new Animal("e5", "Moma", monkey, 2);
        Animal animal5 = animal4;
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal4.name());
        System.out.println(animal5);
        System.out.println(animal4.equals(animal5));
        System.out.println(animal4.equals(animal1));

        //task2
        Owner owner1 = new Owner("Lucifer", 2100, "hell", animal1);
        Owner owner2 = new Owner("Ibuprofenia", 30, "pharmacy", animal2);
        Owner owner3 = new Owner("Jamie Lannister", 35, "under a lot of rocks in King's Landing", animal4);

        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);

    }


}