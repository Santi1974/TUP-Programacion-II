package Punto1.models;

public class Animal {
    protected String name;
    protected int age;
    protected String animalType;
    protected double price;

    public Animal(String name, int age, String animalType, double price) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.price = price;
    }

    public void feed(String name) {
        System.out.println(name + " has been fed.");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Type: " + animalType + ", Price: $" + price;
    }
}
