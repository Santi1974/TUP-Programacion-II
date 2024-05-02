import models.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //CREACION DE INSTANCIAS
        //Creacion de atletas
        Athlete a1 = new Athlete(111111111, "Andres", 1.75, 30, 80.0);
        Athlete a2 = new Athlete(222222222, "Elena", 1.70, 18, 65.0);
        Athlete a3 = new Athlete(456789123, "Miguel", 1.90, 28, 85.3);
        Athlete a4 = new Athlete(654321987, "Martina", 1.65, 22, 70.8);
        Athlete a5 = new Athlete(321987654, "Diego", 1.82, 27, 88.5);
        Athlete a6 = new Athlete(777777777, "Isabel", 1.68, 29, 60.5);
        Athlete a7 = new Athlete(888888888, "Alejandro", 1.88, 32, 90.2);
        Athlete a8 = new Athlete(999999999, "Carolina", 1.76, 31, 75.0);

        // Creacion de equipo
        NationalTeam argentina = new NationalTeam("Blue", "ARG");
        argentina.addTeamAthlete(a1);
        argentina.addTeamAthlete(a2);
        argentina.addTeamAthlete(a3);
        argentina.addTeamAthlete(a4);

        NationalTeam chile = new NationalTeam("Red", "CH");
        chile.addTeamAthlete(a5);
        chile.addTeamAthlete(a6);
        chile.addTeamAthlete(a7);
        chile.addTeamAthlete(a8);

        //Creacion de instalacion
        Location l1 = new Location("Sport", "Mendoza","MDZ Location","Roofed");

        //Creacion de prueba
            //Lista para atletas
        List<Athlete> athletesTest1 = new ArrayList<>();
        athletesTest1.add(a1);
        athletesTest1.add(a2);

            //Lista para locaciones
        List<Location> locationTest1 = new ArrayList<>();
        locationTest1.add(l1);

        Test t1 = new Test(123, "Resistence", athletesTest1, locationTest1);

            //Lista para atletas
        List<Athlete> athletesTest2 = new ArrayList<>();
        athletesTest2.add(a6);
        athletesTest2.add(a7);
        athletesTest2.add(a8);

            //Lista para locaciones
        List<Location> locationTest2 = new ArrayList<>();
        locationTest2.add(l1);

        Test t2 = new Test(321, "Strength", athletesTest2, locationTest2);

        // Creacion de la sede
        Place p1 = new Place(1, "10/10/2024", "10:00", l1, t1);
        Place p2 = new Place(2, "11/11/2024", "13:00", l1, t2);
        l1.addTest(t1);
        l1.addTest(t2);

        //MOSTRAR
        //Desde instalacion nombre del 3er atleta de la 2da prueba
        String name = l1.getTests().get(1).getJoiningAthletes().get(2).getName();
        System.out.println("Desde instalacion nombre del 3er atleta de la 2da prueba: " + name);
        //Desde instalacion codigo de la 2da prueba
        int code = l1.getTests().get(1).getCode();
        System.out.println("Desde instalacion codigo de la 2da prueba: " + code);

        //Desde equipo nacional altura de todos los atletas
        System.out.println("Desde equipo nacional altura de todos los atletas: ");
        for (Athlete athlete : argentina.getTeamAthletes()) {
            System.out.println("Nombre: " + athlete.getName() + " - Altura en metros: " + athlete.getHeight());
        }
        //Desde equipo nacional peso extra
        System.out.println("Desde equipo nacional peso extra: ");
        for (Athlete athlete : argentina.getTeamAthletes()) {
            double imc = athlete.calculateIMC(athlete.getWeight(), athlete.getHeight());
            if (athlete.isOverweight(imc)) {
                System.out.println(athlete.getName() + " tiene peso extra");
            } else {
                System.out.println(athlete.getName() + " no tiene peso extra");
            }
        }


    }
}