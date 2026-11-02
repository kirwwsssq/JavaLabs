package org.example.task11;

public class Plant {
    String name;
    double height;
    String type;

    public Plant(String name, double height, String type){
        this.name=name;
        this.height=height;
        this.type=type;
    }
    public void water(){
        System.out.println("поливаю растение");
    }
    public void water(int liters){
        System.out.println("поливаю"+liters+"литрами");
    }
    public void water(String time){
        System.out.println("поливаю в"+time);
    }
    public void grow(){
        System.out.println("растет медленно");
    }
}
