package Punto1;

import java.util.ArrayList;

public class Group {
    protected String level;
    protected char letter;
    protected ArrayList<Student> students;
    protected ArrayList<Course> courses;

    Group(String level, char letter) {
        this.level = level;
        this.letter = letter;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    void addStudent(Student student) {
        this.students.add(student);
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.addGroup(this);
    }
}
