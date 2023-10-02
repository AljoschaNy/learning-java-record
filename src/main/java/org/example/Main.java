package org.example;

import org.example.zoo.Animal;

public class Main {
    public static void main(String[] args) {
       Animal animal1 = new Animal("a1", "Bello", "husky", 3);
       Animal animal2 = new Animal("b2", "Tiggy", "tiger", 5);
       Animal animal3 = new Animal("c3", "Ellie", "elephant", 10);
       Animal animal4 = new Animal("d4", "Momo", "monkey", 3);
       Animal animal5 = animal4;

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal4.name());
        System.out.println(animal5);

        System.out.println(animal4.equals(animal5));
        System.out.println(animal4.equals(animal1));



    }


}