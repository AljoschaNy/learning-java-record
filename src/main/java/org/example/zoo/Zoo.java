package org.example.zoo;

import java.util.ArrayList;
import java.util.List;

public record Zoo(
        List<Animal> allAnimals
) {
    public int getTotalAmountOfFodderPerDay() {
        int totalAmount = 0;

        for(Animal animal : allAnimals) {
            totalAmount += animal.animalSpecies().fodderAmountPerDay();
            //break;
        }

        return totalAmount;
    }
}
