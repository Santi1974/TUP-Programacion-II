package punto1.clases;
public class Car extends Vehicle{
    private int speed;
    private int cc;

    public Car(String color, int wheels, int speed, int cc) {
        super(color, wheels);
        this.speed = speed;
        this.cc = cc;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}