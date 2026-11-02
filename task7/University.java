package org.example.task7;

import java.awt.print.Printable;

public class University {
    String name;
    int studentsCount;
    String faculties;

    static int totalUniversities =0;
    static int totalStudents =0;


    public University(String name, int studentsCount, String faculties){
        this.name=name;
        this.studentsCount=studentsCount;
        this.faculties=faculties;

        totalUniversities++;
        totalStudents+=studentsCount;
    }
    public static double getAverageStudents(){
        if (totalUniversities == 0){
            return 0;
        }
        return (double) totalStudents/totalUniversities;
    }
    public static void getPrint(){
        System.out.println(totalStudents);
        System.out.println(totalUniversities);
       // System.out.println(getAverageStudents());
    }

}
