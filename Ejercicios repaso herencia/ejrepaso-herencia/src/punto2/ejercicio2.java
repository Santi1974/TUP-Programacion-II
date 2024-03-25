package punto2;

import punto2.clases.Bird;
import punto2.clases.Cat;
import punto2.clases.Dog;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("\nFirst animal:");
        Dog dog = new Dog("Watson", 12, "Male", "German Shepherd");
        dog.makeSound();
        dog.information();

        System.out.println("\nSecond animal:");
        Cat cat = new Cat("Akira", 6, "Female", "Bicolor");
        cat.makeSound();
        cat.information();

        System.out.println("\nThird animal:");
        Bird bird = new Bird("Cornelio", 2, "Female", "Canary");
        bird.makeSound();
        bird.information();
    }
}