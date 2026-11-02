package org.example.task14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("film.txt");
            List<String> lines = List.of(
                    "название: Сумерки",
                    "год выпуска: 2008",
                    "жанр: фантастика/романтика",
                    "режиссер: Кэтрин Хардвик"
            );
            Files.write(path, lines);
            System.out.println("имя файла:" + path.getFileName());
            System.out.println("путь:" + path.toAbsolutePath());
            System.out.println("файл существует: " + Files.exists(path));
            System.out.println("размер файла: " + Files.size(path) + " байт");
            System.out.println("\nсодержимое файла:");
            List<String> readLines = Files.readAllLines(path);
            readLines.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("ошибка"+ e.getMessage());
        }
    }
}

