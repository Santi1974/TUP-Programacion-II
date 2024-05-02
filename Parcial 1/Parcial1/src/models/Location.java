//Instalacion
package models;

import java.util.*;

public class Location {
    private String category;
    private String localization;
    private String name;
    private String type;
    private List<Test> tests;

    public Location(String category, String localization, String name, String type) {
        this.category = category;
        this.localization = localization;
        this.name = name;
        this.type = type;
        this.tests = new ArrayList<>();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void addTest(Test test) {
        tests.add(test);
    }
}