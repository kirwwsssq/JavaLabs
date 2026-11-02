package org.example.task3;

enum Color {
    RED,GREEN,BLUE,YELLOW,BLACK,WHITE
}
public class Car {
    String brand;
    Color color;

    public Car(String brand, Color color){
        this.brand=brand;
        this.color=color;
    }
}
