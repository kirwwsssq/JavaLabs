package org.example.task8;

class Novel extends Book {
    String genre;
    String plotSummary;

    public Novel(String title, String author, int pages, String genre, String plotSummary){
        super(title, author, pages);
        this.genre=genre;
        this.plotSummary=plotSummary;
    }
    public String getGenre(){
        return "роман";
    }
    public String getPlotSummary(){
        return this.plotSummary;
    }
    public void displayInfo(){
      super.dispaleyInfo();
        System.out.println("жанр"+getGenre());
    }
}
