package punto1;
import punto1.clases.*;
import java.lang.reflect.Field;

public class ejercicio1 {
    public static void main(String[] args) {

        Car c1 = new Car("Blue", 4, 210, 2000);
        Bike b1 = new Bike("Red", 2, "Urban");
        Truck t1 = new Truck("Yellow", 4, 160, 3500, 2500);
        Motorbike m1 = new Motorbike("Black", 2, "Urban", 90, 110);

        Vehicle[] v1 = {c1, b1, t1, m1};
        categorize(v1);
    }

    public static void categorize(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Clase: " + vehicle.getClass().getSimpleName());
            Field[] fields = vehicle.getClass().getDeclaredFields();
            for (Field field : fields) {
                try {
                    field.setAccessible(true);
                    Object value = field.get(vehicle);
                    System.out.println(field.getName() + ": " + value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }

    public static void categorize(Vehicle[] vehicles, int wheels){
        int vehiclesAmount = 0;
        for (Vehicle vehicle : vehicles){
            if (vehicle.getWheels() == wheels){
                vehiclesAmount ++;
                System.out.println("Clase: " + vehicle.getClass().getSimpleName());
                Field[] fields = vehicle.getClass().getDeclaredFields();
                for (Field field : fields) {
                    try {
                        field.setAccessible(true);
                        Object value = field.get(vehicle);
                        System.out.println(field.getName() + ": " + value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
            }
        }
        System.out.println("There are " + vehiclesAmount + " vehicles with " + wheels + " wheels.");
    }


}