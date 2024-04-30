package Punto1;

import java.util.ArrayList;

public class Teacher extends Person {
    protected String department;
    protected ArrayList<Course> courses;

    Teacher(int dni, String name, String department) {
        super(dni, name);
        this.department = department;
        this.courses = new ArrayList<>();
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.addTeacher(this);
    }
}
