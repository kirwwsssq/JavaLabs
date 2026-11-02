package org.example.task3;

public class Main {
    public static void main (String[] args){
        Car[] cars=new Car[6];
        cars[0] = new Car(" Ferrari ", Color.RED);
        cars[1] = new Car(" Akura ", Color.BLACK);
        cars[2] = new Car(" Honda ", Color.BLUE);
        cars[3] = new Car(" BMW ", Color.GREEN);
        cars[4] = new Car(" Tesla ", Color.WHITE);
        cars[5] = new Car(" Mazda ", Color.RED);

       for (int i=0; i< cars.length;i++){
           if (cars[i].color==Color.RED){
               System.out.println("марка"+cars[i].brand+"цвет"+cars[i].color);

           }
       }
    }
}
