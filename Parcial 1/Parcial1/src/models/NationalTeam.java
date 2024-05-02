package models;
import java.util.*;

public class NationalTeam {
    private String color;
    private String country;
    private List<Athlete> teamAthletes;

    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        this.teamAthletes =  new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Athlete> getTeamAthletes() {
        return teamAthletes;
    }

    public void addTeamAthlete(Athlete athlete) {
        teamAthletes.add(athlete);
    }
}
