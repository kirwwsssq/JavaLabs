package org.example.task14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Path path = Paths.get("f.txt");
            List<String> numbers = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                System.out.print("введите число: ");
                int number = scanner.nextInt();
                numbers.add(String.valueOf(number));
                if (number > 0) {
                    sum += number;
                }
            }
            Files.write(path, numbers);
            System.out.println("\nчисла из файла:");
            Files.readAllLines(path).forEach(System.out::println);

            System.out.println("сумма положительных чисел: " + sum);

            scanner.close();

        } catch (Exception e) {
            System.out.println("ошибка"+ e.getMessage());
        }
    }
}
