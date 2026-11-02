package org.example.task8;
import java.util.List;
public class Main {
    public static void main (String [] args){
        Novel novel = new Novel("Война и мир", "Л.Н.Толстой",1200, "роман","рассказывает " +
                "о жизни людей, исторических сражений и поиска смысла бытия на фонее войны с Напалеоном");
        novel.dispaleyInfo();
        System.out.println("сюжет:"+ novel.getPlotSummary());

        Textbook textbook = new Textbook("HTML с нуля", "В.С. Сидоров", 600, "программирование",
                List.of("Введение в HTML", "Теги и атрибуты", "Списки и таблицы", "Формы"));
        System.out.println("Список глав учебника: " + textbook.getChapterList());

    }
}
