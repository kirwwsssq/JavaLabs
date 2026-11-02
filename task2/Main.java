package org.example.task2;

public class Main {
    public static void main (String[] args){
        Restaurant[] restaurants= new Restaurant[5];
        restaurants[0]= new Restaurant("Васильки","Белорусская", 5.0);
        restaurants[1]= new Restaurant("Sueno","Испанская", 4.8);
        restaurants[2]= new Restaurant("Панский драник","Белорусская", 4.0);
        restaurants[3]= new Restaurant("UMAMI","Азиатская", 4.6);
        restaurants[4]= new Restaurant("Тан Чао","Китайская", 4.3);

        Restaurant max=restaurants[0];
        double rrating=0.0;

        for(int i=0;i<restaurants.length;i++) {
            if (restaurants[i].rating > max.rating) {
                max = restaurants[i];
            }
            rrating += restaurants[i].rating;
        }

        double avgrating=rrating/restaurants.length;
        System.out.println("ресторан с макс рейтингом"+ max.name +","+max.rating);
        System.out.println("ср рейтинг"+ avgrating);

        System.out.println(max);
    }
}
