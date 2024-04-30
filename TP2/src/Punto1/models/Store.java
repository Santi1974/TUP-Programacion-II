package Punto1.models;

import java.util.ArrayList;

public class Store {
    private ArrayList<Animal> animalList;

    public Store() {
        animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        System.out.println(animal.name + " has been added to the store.");
    }

    public void sellAnimal(String name) {
        for (Animal animal : animalList) {
            if (animal.name.equals(name)) {
                animalList.remove(animal);
                System.out.println(animal.name + " has been sold.");
                return;
            }
        }
        System.out.println("No animal found with that name.");
    }

    public void feedAnimal(String name) {
        for (Animal animal : animalList) {
            if (animal.name.equals(name)) {
                animal.feed(name);
                return;
            }
        }
        System.out.println("No animal found with that name.");
    }

    public void listAnimals() {
        System.out.println("Animals in the store:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}
