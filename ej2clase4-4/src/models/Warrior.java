package models;

public class Warrior extends CharacterBase {

    public Warrior(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack(CharacterBase character) {
        System.out.println("El guerrero hace 150 de daño a " + character.getName());
        character.defend(150);
    }

    @Override
    public void defend(int damage) {
        setHealth(getHealth() - (damage - 15));
        System.out.println("La vida del guerrero baja a " + getHealth());
    }
}

