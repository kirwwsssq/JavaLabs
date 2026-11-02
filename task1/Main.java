package org.example.task1;

public class Main {
    public static void main(String[] args){
        Apartment apartment = new Apartment("ул.Варвашени, 59", 4, 84.5 );
        double totalPrice= 7890000.0;
        double pricePerSqM=apartment.pricePerSquareMeter(totalPrice);

        System.out.println("адрес"+apartment.address);
        System.out.println("цена за кв.метр:"+pricePerSqM);
    }
}