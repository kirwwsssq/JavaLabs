package org.example.task7;

public class Main {
    public static void main(String[] args){
        University unic1 = new University("БГУИР", 2500,  "ФКСИС");
        University unic2 = new University("БНТУ", 3500,  "ФКСИС");
        University unic3 = new University("БГУ", 2700,  "ФКСИС");

        System.out.println("Среднее число студентов: " + University.getAverageStudents());
    }
}
