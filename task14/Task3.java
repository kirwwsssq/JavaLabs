package org.example.task14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        try{
            Path f= Paths.get("f.txt");
            Path g=Paths.get("g.txt");
            Path h=Paths.get("h.txt");

            Random random=new Random();
            List<String> numbers = new ArrayList<>();
            for(int i=0; i<20;i++){
                int number = random.nextInt(201)-100;
                numbers.add(String.valueOf(number));
            }
            Files.write(f,numbers);
            List<String> groupG =new ArrayList<>();
            List<String> groupH = new ArrayList<>();
            List<String> readLines = Files.readAllLines(f);
            for (String line : readLines) {
                int number = Integer.parseInt(line);
                if (Math.floorMod(number, 3) == 1) {
                    groupG.add(line);
                } else {
                    groupH.add(line);
                }
            }
            Files.write(g, groupG);
            Files.write(h, groupH);
            System.out.println("файл f:");
            Files.readAllLines(f).forEach(System.out::println);
            System.out.println("\nфайл g:");
            Files.readAllLines(g).forEach(System.out::println);
            System.out.println("\nфайл h :");
            Files.readAllLines(h).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("ошибка"+ e.getMessage());
        }
    }
}