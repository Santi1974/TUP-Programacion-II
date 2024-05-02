//Sede
package models;

public class Place{
    private int phase;
    private String date;
    private String time;
    private Location site;
    private Test test;

    public Place(int phase, String date, String time, Location site, Test test) {
        this.phase = phase;
        this.date = date;
        this.time = time;
        this.site = site;
        this.test = test;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Location getSite() {
        return site;
    }

    public void setSite(Location site) {
        this.site = site;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}