package org.example.task14;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Task5 {public static void main(String[] args) {
    try {
        Path path = Paths.get("f.txt");
        Random random = new Random();
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(101);
            numbers.add(String.valueOf(number));
        }
        Files.write(path, numbers);
        List<String> lines = Files.readAllLines(path);
        int count = 0;
        System.out.println("числа из файла:");
        for (String line : lines) {
            int number = Integer.parseInt(line);
            System.out.println(number);
            if (number > 50) {
                count++;
            }
        }
        System.out.println("кол-во чисел больше 50: " + count);
    } catch (Exception e) {
        System.out.println("ошибка"+ e.getMessage());
    }
}
}
