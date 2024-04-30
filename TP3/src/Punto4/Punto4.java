package Punto4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto4 {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelecciona una opcion:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Calcular y mostrar el promedio de notas");
            System.out.println("4. Mostrar al estudiante con la nota mas alta");
            System.out.println("5. Buscar estudiante por nombre");
            System.out.println("6. Salir");

            int option = 0;
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudentList();
                    break;
                case 3:
                    calculateAverageGrade();
                    break;
                case 4:
                    showStudentWithHighestGrade();
                    break;
                case 5:
                    searchStudentByName();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion invalida, seleccione un numero del 1 al 6.");
            }
        }
        scanner.close();
    }

    private static void addStudent() {
        try {
            System.out.println("Ingrese el nombre del estudiante:");
            String name = scanner.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            int age = scanner.nextInt();
            System.out.println("Ingrese la nota del estudiante:");
            double grade = scanner.nextDouble();
            studentList.add(new Student(name, age, grade));
            System.out.println("Estudiante agregado con exito.");
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingrese valores válidos para la edad y la nota.");
            scanner.nextLine();
        }
    }

    private static void showStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("Lista de estudiantes:");
        for (Student student : studentList) {
            System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge() + ", Nota: " + student.getGrade());
        }
    }

    private static void calculateAverageGrade() {
        if (studentList.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        double sumGrades = 0;
        for (Student student : studentList) {
            sumGrades += student.getGrade();
        }
        double average = sumGrades / studentList.size();
        System.out.println("La nota promedio de todos los estudiantes es: " + average);
    }

    private static void showStudentWithHighestGrade() {
        if (studentList.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        Student studentWithHighestGrade = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGrade() > studentWithHighestGrade.getGrade()) {
                studentWithHighestGrade = student;
            }
        }
        System.out.println("El estudiante con la nota mas alta es:");
        System.out.println("Nombre: " + studentWithHighestGrade.getName() + ", Edad: " + studentWithHighestGrade.getAge() + ", Nota: " + studentWithHighestGrade.getGrade());
    }

    private static void searchStudentByName() {
        if (studentList.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("Ingresa el nombre del estudiante que deseas buscar:");
        String nameToSearch = scanner.nextLine();
        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(nameToSearch)) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge() + ", Nota: " + student.getGrade());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No fue encontrado un estudiante con ese nombre.");
        }
    }
}