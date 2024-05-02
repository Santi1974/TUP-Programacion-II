package models;

import java.util.List;

public class Test {
    private int code;
    private String title;
    private List<Athlete> joiningAthletes;
    private List<Location> sites;

    public Test(int code, String title, List<Athlete> joiningAthletes, List<Location> sites) {
        this.code = code;
        this.title = title;
        this.joiningAthletes = joiningAthletes;
        this.sites = sites;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Athlete> getJoiningAthletes() {
        return joiningAthletes;
    }

    public void addJoiningAthletes(Athlete athlete) {
        joiningAthletes.add(athlete);
    }

    public List<Location> getSites() {
        return sites;
    }

    public void addSite(Location site) {
        sites.add(site);
    }
}