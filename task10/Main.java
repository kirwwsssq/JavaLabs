package org.example.task10;

public class Main {
    public static void main(String[] args) {
        Cookable[] cookables = new Cookable[5];

        cookables[0] = new Pizza("маргарита", "сыр, томаты", 15, "через 2 дня");
        cookables[1] = new Pizza("пепперони", "сыр, колбаски пепперони", 12, "через 3 дня");
        cookables[2] = new Pizza("четыре Сыра", "моцарелла, пармезан", 14, "через 2 дня");
        cookables[3] = new Soup("борщ", "свекла, Капуста, Мясо", 60, "через 5 дней");
        cookables[4] = new Soup("том ям", "креветки, грибы, кокосовое молоко", 25, "завтра");

        for (Cookable cooking : cookables) {
            cooking.cook();
            System.out.println("время" + cooking.getCookingTime());
            if (cooking instanceof Storable) {
                Storable storableCooking = (Storable) cooking;
                storableCooking.store();
                System.out.println("срок годности до:" + storableCooking.getExpirationDate());
            }
        }
    }
}
