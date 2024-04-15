package models;

public interface Character {
    void attack(CharacterBase character);
    void defend(int damage);
}
