package org.example.task8;
import java.util.List;
class Textbook extends Book{
    String subject;
    List<String> chapterList;
    public Textbook(String title, String author,int pages, String subject, List<String> chapterList) {
        super(title, author, pages);
        this.subject = subject;
        this.chapterList = chapterList;
    }
    public String getGenre(){
        return "учебник"+subject;
    }
    public List<String> getChapterList(){
        return chapterList;
    }
}
