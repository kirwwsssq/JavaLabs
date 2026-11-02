package org.example.task12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Athlete> athletesMap = new HashMap<>();
        athletesMap.put("Лионель", new Footballer("Лионель", 1, 7, 800));
        athletesMap.put("Криштиану", new Footballer("Криштиану", 2, 5, 850));
        athletesMap.put("Неймар", new Footballer("Неймар", 3, 3, 400));

        athletesMap.put("Леброн", new Basketballer("Леброн", 4, 4, 39000));
        athletesMap.put("Стефен", new Basketballer("Стефен", 5, 2, 22000));
        athletesMap.put("Майкл", new Basketballer("Майкл", 6, 6, 32000));

        athletesMap.put("Стив", new Swimmer("Стив", 7, 28, 39));
        athletesMap.put("Иан", new Swimmer("Иан", 8, 9, 13));
            for (String key: athletesMap.keySet()){
                System.out.println(key);
            }
        }
    }

