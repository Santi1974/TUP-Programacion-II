package models;

public class Athlete extends Person implements Contract{
    private double height;
    private int age;
    private double weight;

    public Athlete(int id, String name, double height, int age, double weight) {
        super(id, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateIMC(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    @Override
    public boolean isOverweight(double imc) {
        return imc > 24.9;
    }

    @Override
    public double takingHeartRate() {
        System.out.println("...Taking heart rate...");
        //Devuelve un numero random entre 100 y 200 (pulsaciones promedio)
        return (Math.random() * (200 - 100) + 100);
    }
}
