package org.example.task10;

public class Pizza implements Cookable, Storable {
    String name;
    String toppings;
    int cookingTime;
    String expirationDate;

    public Pizza(String name, String toppings, int cookingTime, String expirationDate) {
        this.name = name;
        this.toppings = toppings;
        this.cookingTime = cookingTime;
        this.expirationDate = expirationDate;
    }

    public void cook() {
        System.out.println("выпекаем пиццу" + name + "с топпингам" + toppings);

    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public void store() {
        System.out.println("пицца" + name);
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }


}
