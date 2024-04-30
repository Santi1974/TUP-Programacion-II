package Punto1.models;

public class Bird extends Animal {
    private String species;
    private boolean canSpeak;

    public Bird(String name, int age, double price, String species, boolean canSpeak) {
        super(name, age, "Bird", price);
        this.species = species;
        this.canSpeak = canSpeak;
    }
}