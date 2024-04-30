package Punto1;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Teacher maestro = new Teacher(12345678, "Juan Pérez", "Informática");
        Course curso2 = new Course(102, "11:30", "Bases de datos");
        maestro.addCourse(new Course(101, "9:00", "Programación"));
        maestro.addCourse(curso2);
        maestro.addCourse(new Course(103, "14:00", "Inglés"));

        Student estudiante = new Student(98765432, "María García");

        Group grupo1 = new Group("1A", 'A');
        grupo1.addStudent(estudiante);
        grupo1.addCourse(new Course(201, "9:00", "Matemáticas"));
        grupo1.addCourse(new Course(202, "11:00", "Historia"));

        curso2.addGroup(grupo1);

        grupo1.courses.get(1).addTeacher(maestro);

        estudiante.addGroups(grupo1);
        estudiante.addGroups(new Group("1B", 'B'));
        estudiante.addGroups(new Group("1C", 'C'));

        System.out.println("\nAula del tercer curso: " + maestro.courses.get(2).classroom);

        System.out.println("\nCursos dictados por el profesor:");
        for (Course curso : maestro.courses) {
            System.out.println(curso.name);
        }

        Course curso = grupo1.courses.get(0);
        System.out.println("\nEstudiantes en el grupo que recibe el curso " + curso.name + ":");
        for (Student s : grupo1.students) {
            System.out.println("Nombre: " + s.name + ", DNI: " + s.dni);
        }

        System.out.println("\nLetra del tercer grupo al que pertenece el estudiante: " + estudiante.groups.get(2).letter);

        System.out.println("\nCursos del primer grupo al que pertenece el estudiante:");
        for (Course c : estudiante.groups.get(0).courses) {
            System.out.println(c.name);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese el nombre de un curso:");
        String nombreCurso = scanner.nextLine();
        for (Group g : estudiante.groups) {
            for (Course c : g.courses) {
                if (c.name.equals(nombreCurso)) {
                    System.out.println("Profesores relacionados con un curso de un estudiante:");
                    for (Teacher t : c.teachers) {
                        System.out.println(t.name);
                    }
                }
            }
        }
        System.out.println("\nEstudiantes relacionados con un grupo relacionado con el segundo curso de un profesor");
        for (Group g : maestro.courses.get(1).groups) {
            for (Student s : g.students) {
                System.out.println(s.name);
            }
        }
    }
}
