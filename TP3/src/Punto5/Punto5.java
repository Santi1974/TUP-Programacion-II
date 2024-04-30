package Punto5;

import java.util.*;

public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        boolean running = true;
        while (running) {
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Remover tarea");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            int option = 0;
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    try {
                        System.out.print("Ingresa la descripcion de la tarea: ");
                        String description = scanner.nextLine();
                        System.out.print("Ingresa la prioridad de la tarea: ");
                        int priority = scanner.nextInt();
                        scanner.nextLine();
                        taskList.addTask(new Task(description, priority));
                        System.out.println("Tarea agregada con exito.");
                    } catch (Exception e) {
                        System.out.println("Error al agregar tarea. Por favor, asegúrate de ingresar valores válidos.");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Tareas:");
                    for (Task task : taskList) {
                        System.out.println(task);
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Ingresa la descripcion de la tarea a remover: ");
                        String descriptionToRemove = scanner.nextLine();
                        taskList.removeTask(descriptionToRemove);
                        System.out.println("Tarea removida con exito.");
                    } catch (Exception e) {
                        System.out.println("Error al remover tarea. Por favor, asegúrate de ingresar una descripción válida.");
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opcion invalida, seleccione un numero del 1 al 4.");
                    break;
            }
        }
        scanner.close();
    }
}
