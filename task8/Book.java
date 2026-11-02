package org.example.task8;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author,int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    public String getGenre(){
        return "жанр";
    }
    public void dispaleyInfo(){
        System.out.println("название:"+ title);
        System.out.println("автор:"+author);
        System.out.println("кол-во страниц:"+pages);
        //  System.out.println("жанр:"+getGenre());
    }

}
