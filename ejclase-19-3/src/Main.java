import modelos.*;
public class Main {
    public static void main(String[] args) {

        Empleado employee1 = new Empleado("Juan");
        Operador operator1 = new Operador("Sergio", "Marketing");
        Directivo directive1 = new Directivo("Carlos", "Sales");
        Oficial officer1 = new Oficial("Juan Alessi", "Human resources", "Interviews");
        Tecnico technician1 = new Tecnico("Andres", "Sales", "Marketing");

        System.out.println(employee1.toString());
        System.out.println(operator1.toString());
        System.out.println(directive1.toString());
        System.out.println(officer1.toString());
        System.out.println(technician1.toString());
    }
}