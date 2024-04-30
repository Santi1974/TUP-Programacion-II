package Punto1;
import  Punto1.models.*;
public class Punto1 {
    public static void punto1(String[] args) {
        Store store = new Store();

        Dog dog = new Dog("Milo", 3, 120000, "Bulldog", true);
        Cat cat = new Cat("Luna", 2, 1000, "Orange", false);
        Bird bird = new Bird("Lucas", 1, 30000, "Canarie", false);
        Fish fish = new Fish("Marcos", 1, 5800);

        store.addAnimal(dog);
        store.addAnimal(cat);
        store.addAnimal(bird);
        store.addAnimal(fish);

        store.sellAnimal("Whiskers");

        store.feedAnimal("Buddy");

        store.listAnimals();
    }
}
