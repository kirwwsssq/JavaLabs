package org.example.task14;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task4 {public static void main(String[] args) {
    try {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("rost.txt");
        List<String> heights = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < 14; i++) {
            System.out.print("введите рост ученика: ");
            double height = scanner.nextDouble();
            heights.add(String.valueOf(height));
        }
        Files.write(path, heights);
        List<String> lines = Files.readAllLines(path);
        System.out.println("\nрост учеников:");
        for (String line : lines) {
            double height = Double.parseDouble(line);
            System.out.println(height);
            sum += height;
        }
        double average = sum / lines.size();
        System.out.println("средний рост: " + average + " см");
        scanner.close();
    } catch (Exception e) {
        System.out.println("ошибка"+ e.getMessage());
    }
}
}
