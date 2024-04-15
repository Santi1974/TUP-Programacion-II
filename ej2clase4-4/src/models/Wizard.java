package models;

public class Wizard extends CharacterBase {

    public Wizard(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack(CharacterBase character) {
        System.out.println("El mago hace 120 de daño a " + character.getName());
        character.defend(120);
    }

    @Override
    public void defend(int damage) {
        setHealth(getHealth() - (damage - 20));
        System.out.println("La vida del mago baja a " + getHealth());
    }
}