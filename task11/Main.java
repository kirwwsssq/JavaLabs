package org.example.task11;

public class Main {
    public static void main(String[] args){
        Plant plant=new Plant("куст",1.3, "кустарник");
        Tree tree=new Tree("дуб", 6.1, "лиственное дерево");
        Flower flower=new Flower("роза", 0.6,"декоративный цветок");

        plant.water();
        plant.water(3);
        plant.water("9:00");
        plant.grow();

        tree.water();
        tree.water(10);
        tree.water("19:00");
        tree.grow();

        flower.water();
        flower.water(2);
        flower.water("10:00");
        flower.grow();
    }
}
