package org.example.task12;

public class Swimmer extends Athlete{
    int records;
    public Swimmer(String name, int id, int medals, int records){
        super(name, id, medals);
        this.records=records;
    }

    public String toString() {
        return "пловец-"+"медали:"+medals+"рекорды:"+records;
    }
}
