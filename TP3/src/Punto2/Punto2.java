package Punto2;

public class Punto2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Marcos");
        Employee e2 = new Employee("Juan");

        e1.assignSupervisor(e2);

        System.out.println("El supervisor de " + e1.name + " es: " + e2.getSupervisorName());
    }
}