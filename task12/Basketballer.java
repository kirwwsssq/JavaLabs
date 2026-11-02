package org.example.task12;

public class Basketballer extends Athlete{
    int points;
    public Basketballer(String name, int id, int medals, int points){
        super(name, id, medals);
        this.points=points;
    }
    public String toString() {
        return "баскетболист-"+"медали:"+medals+"очки:"+points;
    }
}
