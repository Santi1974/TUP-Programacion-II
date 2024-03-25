package modelos;

public class Empleado {
    private String name;

    //Constructor
    public Empleado(String name) {
        this.name = name;
    }

    //Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee name: " + this.getName();
    }
}