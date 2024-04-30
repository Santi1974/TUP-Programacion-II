package Punto1.models;

public class Cat extends Animal {
    private String breed;
    private boolean sterilized;

    public Cat(String name, int age, double price, String breed, boolean sterilized) {
        super(name, age, "Cat", price);
        this.breed = breed;
        this.sterilized = sterilized;
    }
}
