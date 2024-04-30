package Punto1;

import java.util.ArrayList;

public class Student extends Person {
    protected ArrayList<Group> groups;

    Student(int dni, String name) {
        super(dni, name);
        this.groups = new ArrayList<>();
    }

    void addGroups(Group group) {
        this.groups.add(group);
    }
}
