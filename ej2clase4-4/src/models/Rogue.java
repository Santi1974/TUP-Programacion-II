package models;

public class Rogue extends CharacterBase {

    public Rogue(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack(CharacterBase character) {
        System.out.println("El guerrero hace 100 de daño a " + character.getName());
        character.defend(100);
    }

    @Override
    public void defend(int damage) {
        setHealth(getHealth() - (damage - 30));
        System.out.println("La vida del picaro baja a " + getHealth());

    }
}

