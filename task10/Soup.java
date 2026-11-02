package org.example.task10;

public class Soup implements Cookable, Storable {
    String name;
    String ingredients;
    int cookingTime;
    String expirationDate;

    public Soup(String name, String ingredients, int cookingTime, String expirationDate) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
        this.expirationDate = expirationDate;
    }

    public void cook() {
        System.out.println("варим суп" + name);
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public void store() {
        System.out.println("суп" + name + "перелит в тарелку");
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }
}




