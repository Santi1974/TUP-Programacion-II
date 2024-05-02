package models;

public interface Contract {
    double calculateIMC(double weight, double height);
    boolean isOverweight(double imc);
    double takingHeartRate();
}