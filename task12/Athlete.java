package org.example.task12;

public class Athlete {
    String name;
    int id;
    int medals;

    public Athlete(String name, int id, int medals) {
        this.name=name;
        this.id=id;
        this.medals=medals;
    }

    public String toString(){
        return "id"+id+"медали:"+medals;
    }
}