package Punto1.models;

public class Dog extends Animal {
    private String breed;
    private boolean vaccinated;

    public Dog(String name, int age, double price, String breed, boolean vaccinated) {
        super(name, age, "Dog", price);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }
}
