package punto1.clases;

public class Bike extends Vehicle {
    private String type;

    public Bike(String color, int wheels, String type) {
        super(color, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}