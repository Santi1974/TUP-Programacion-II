import models.*;
public class Main {
    public static void main(String[] args) {

        Wizard wizard = new Wizard("Carlos", 120, 90);
        Warrior warrior = new Warrior("Juan", 5, 110);
        Rogue rogue = new Rogue("Alberto", 88, 80);

        wizard.attack(warrior);
        warrior.attack(rogue);
        rogue.attack(wizard);

    }
}
