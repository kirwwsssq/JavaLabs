package org.example.task13;

import java.util.ArrayList;
import java.util.List;

public class Team{
    private String country;
    List<Athlete> athletes=new ArrayList<>();

    public Team(String country){
        this.country=country;
    }
    public void addAthlete(Athlete athlete){
        athletes.add(athlete);
    }
    public Athlete findAthlete(String name) throws AthleteNotFoundException{
        for(Athlete athlete:athletes){
            if(athlete.name==name){
                return athlete;
            }
        }
        throw new AthleteNotFoundException("спортсмен не найден"+name);
    }
    public void printInfo(){
        System.out.println("состав команд"+country);
        for (Athlete athlete: athletes){
            System.out.println(athlete);
        }
    }
}
