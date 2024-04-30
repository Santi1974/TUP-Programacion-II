package Punto1;

import java.util.ArrayList;

public class Course {
    protected int classroom;
    protected String time;
    protected String name;
    protected ArrayList<Teacher> teachers;
        protected ArrayList<Group> groups;

    Course(int classroom, String time, String name) {
        this.classroom = classroom;
        this.time = time;
        this.name = name;
        this.teachers = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    void addGroup(Group group) {
        this.groups.add(group);
    }
}
