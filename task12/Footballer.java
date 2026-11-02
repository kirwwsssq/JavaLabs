package org.example.task12;

public class Footballer extends Athlete{
    int goals;
    public Footballer(String name,int id, int medals, int goals){
        super(name,id,medals);
        this.goals=goals;
    }
    public String toString(){
        return "футболист-"+"медали:"+medals+"голы:"+goals;
    }
}
