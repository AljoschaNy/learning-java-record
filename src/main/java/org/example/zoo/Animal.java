package org.example.zoo;

public record Animal(
        String id,
        String name,
        Species animalSpecies,
        int age
) {
}
