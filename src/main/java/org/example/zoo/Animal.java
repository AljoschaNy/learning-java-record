package org.example.zoo;

public record Animal(
        String id,
        String name,
        Species animalSpecies,
        int age
) {
    public Animal withId(String id) {
return new Animal(id, this.name, this.animalSpecies, this.age);
    }
    public Animal withName(String name) {
        return new Animal(this.id, name, this.animalSpecies, this.age);
    }
    public Animal animalSpecies(Species animalSpecies) {
        return new Animal(this.id, this.name, animalSpecies, this.age);
    }
    public Animal withAge(int age) {
        return new Animal(this.id, this.name, this.animalSpecies, age);
    }
}
