package punto1.clases;

public class Truck extends Car{
    private double load;

    public Truck(String color, int wheels, int speed, int cc, float load) {
        super(color, wheels, speed, cc);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
}